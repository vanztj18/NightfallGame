import java.util.Scanner;
import java.util.ArrayList;

public class ruins {

	int clearScreen;
	
	ArrayList<String> question = new ArrayList<String>();
	static int[] answer = {15, 5, 732};
	
	private Scanner scanner;

	public void ruinStart() {
		question.add("'The first sequence is: 3, 4, 7, 8, 11, 12, __'");
		question.add("'The second sequence is: 5, 10, 0, 5, 10, 0, __'");
		question.add("'The third sequence is: 768, 757, 745, __'");
		
		scanner = new Scanner(System.in);

		System.out.printf("You arrive at a the rim of what looks like a crater. %n"
				+ "At the bottom of the crater, you see what looks like a chaotic jumble of rocks. %n"
				+ "%n"
				+ "<<Those are the ruins, Commander, I don't know what it used to be, but it looks like Sentinel ruins.>>%n"
				+ "<<Caution is advised.>>%n"
				+ "%n");


		System.out.printf("As you get closer to the ruins you can start making out more detail, towering monoliths and collapsed structures.%n"
				+ "You enter the ruins and you notice strange glpyhs ecthed into the monoliths that glow as you get close to them.%n"
				+ "You arrive at a door covered in glyphs, that looks like it leads to an underground structure.%n"
				+ "You see three shiny dome shaped protrusions, slightly larger than your hand, placed in a triangle shape on the door.%n"
				+ "%n"
				+ "<<This is a standard Sentinel door, Commander, what little we know of the Sentinels is that they where telepathic, so you would open this door by putting your hand on the contact and thinking of the correct number.>>%n"
				+ "%n"
				+ "Do you place your hand on the first contact?%n"
				+ "1. Yes%n"
				+ "2. No%n");

		int input = scanner.nextInt();
		while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

		if (input == 1) {
			System.out.printf("You place your hand on the first contact and feel a powerful jolt pass through your body, but it doesnt hurt.%n"
					+ "You hear in your head, in english: ");
			startPuzzle();
		}
		else {
			System.out.println("You decide walk away from the door.");
			ruinStart();
		}
	}

	public void startPuzzle() {
		shipStatus changePowerPlant = new shipStatus(); 
		scanner = new Scanner(System.in);


		System.out.printf("%s%n", question.get(0));
		System.out.printf("'Think of the last number of the sequence:'%n");
		int num1 = scanner.nextInt();

		System.out.printf("%s%n", question.get(1));
		System.out.printf("'Think of the last number of the sequence:'%n");
		int num2 = scanner.nextInt();

		System.out.printf("%s%n", question.get(2));
		System.out.printf("'Think of the last number of the sequence:'%n");
		int num3 = scanner.nextInt();
		
		boolean correct = puzzleResults(num1, num2, num3);

		if (correct == true) {
			System.out.printf("The voice in your head says nothing, and the door sliently slides open, reveling a dark passageway.%n"
					+ "You enter the passage with your suit light on. %n"
					+ "The passage is made out of an unknown metal, covered in unknown symbols. %n");
			toriPuzzle();
			System.out.printf("You come to a massive underground chamber, filled with old Sentinel ships in various states of disrepair%n"
					+ "%n"
					+ "<<Note this, Commander, just think of how the Federation could advance with all this Sentinel tech.>>%n"
					+ "%n"
					+ "You start looking around, looking through the ships for salvage.%n"
					+ "%n"
					+ "<<There, Commander, a functioning power module, its Sentinel, which may be better than the old one.>>%n"
					+ "%n"
					+ "After a lot of work you manage to get the power module loose.%n"
					+ "%n");
			shipStatus.powerPlant = 1;

			System.out.printf("Would you like to return to the Nightfall?%n");
			System.out.printf("1. Yes%n");
			System.out.printf("2. No%n");		

			Integer input = scanner.nextInt();
			while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

			if (input == 1) {
				changePowerPlant.displayStatus();
			}
		}
		else {
			System.out.printf("'Incorrect, please try again'%n");
			startPuzzle();
		}
	}

	public static boolean puzzleResults(int lock1, int lock2, int lock3) {
		boolean results = false;

		if (lock1 == answer[0] && lock2 == answer[1] && lock3 == answer[2]) {
			results = true;
		}
		else {
			results = false;
		}

		return results;
	}
	
	public void toriPuzzle() {
		scanner = new Scanner(System.in);
		
		System.out.printf("You come to another door, blocking the way foward. %n"
				+ "As you look aroud, you see that in a alcove of the corridor wall, there is a pedestal with three equally spaced metal poles on top of it. %n"
				+ "The leftmost pole has three different sized rings on it. %n"
				+ "They are placed such that the largest ring is on the bottom and the smallest is on the top. %n"
				+ "What do you do?%n"
				+ "1. Place one of the rings around each pole %n"
				+ "2. Look for ring shaped indentations on the walls %n"
				+ "3. Rearrange the rings to go the opposite walls %n"
				+ "4. Remove the center and rightmost poles %n");
		
		while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}
		
		Integer input = scanner.nextInt();
		
		if (input == 3) {
			System.out.printf("You rearrange the rings and they glow and spark with electricity, the door sliding open. %n"
					+ "%n");
		}
		else if (input == 4) {
			System.out.printf("You try to remove the metal poles but they remain firmly attached. %n"
					+ "%n");
			toriPuzzle();
		}
		else {
			System.out.printf("Nothing Happens. %n"
					+ "%n");
			toriPuzzle();
		}
		
		
	}
}
