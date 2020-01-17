import java.util.Scanner;

public class distressSignal {

	Scanner scanner = new Scanner(System.in);
	shipStatus changeFuel = new shipStatus();

	int clearScreen;

	public void startdistressSignal() {
		System.out.printf("You decide to track the distress signal to its source.%n");
		System.out.printf("When following the signal you come across a crashed ship. The ship appears to be of a new model. You can assume that this is the source.%n");
		System.out.printf("Approaching the ship you see a man dressed in a civilian space suit outside of the ship working on some kind of panel.%n"
				+ "%n");
		System.out.printf("Do you interrupt and say something or do you wait for them to finish? %n"
				+ "1. Interrupt%n"
				+ "2. Wait%n");

		Integer input2 = scanner.nextInt();
		while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

		System.out.printf(input2 == 1 ? "You decide to interrupt, the person jumps at the sound of your voice, whirling around, drawing a blaster.%n" : "You wait until the person finishes, after about a minute, the person turns around and drops their tool and pulls out a blaster upon seeing you.%n"
				+ "%n");
		System.out.printf("By the time your hand reaches your holstered blaster, his is already leveled at your head.%n");
		System.out.printf("The man says 'Why don't you just take your hand away from that and we can talk like civilized people on this uncivilized world'.%n"
				+ "%n");
		System.out.printf("Do you take your hand away or do you pull your blaster?%n"
				+ "1. Comply%n"
				+ "2. Draw%n"
				+ "%n");
		System.out.printf(input2 == 1 ? "You take you blaster out slowly and lightly toss it a few feet from you.%n" : "You try to go for the quick-draw, pulling your blaster fast and taking a shot, but the shot goes wide and pings harmlessly of the ship to the man's left (you have never been any good at quick draw), the man takes his blaster and shoots your gun hand, you feel searing pain in your hand and drop the blaster in shock.%n"
				+ "%n");
		System.out.printf("You nod your head yes%n"
				+ "%n");
		System.out.printf("The man says 'I see by your uniform that you are navy, how did one of you manage to get stuck here'.%n");
		System.out.printf("The man says 'Nevermind, it doesn't matter now anyhow, we are all equal here at the mercy of the void.'%n");
		System.out.printf("The man continues 'Is there anything you need, we may be able to help you, our ship here is all fixed except for this wiring'.%n"
				+ "%n");
		System.out.printf("You say the last thing you need is fuel.%n"
				+ "%n");
		System.out.printf("The man responds 'We have a full tank, we are thankfull we didn't lose any crashing, we can spare half of it to be able to still get of this planet and to the closest port'.%n");
		System.out.printf("Just then you hear a loud BANG from inside the ship and also hear a female voice from the inside yelling 'JACKSON GET IN HERE IMMEDENTLY'.%n");
		System.out.printf("The man, who you assume is Jackson, sighs and says 'You can take half our fuel, it will be enough to get both you and I to safety, I trust you will respect this kindness'.%n");
		System.out.printf("And with that, Jackson rushes into the ship, and you are alone with the fuel cells.%n"
				+ "%n");

		System.out.printf("The choice is yours, take all of their fuel and guarantee your escape, or take half and run the risk of not making it out.%n");
		fuelCounter();
	}
	public void fuelCounter() {
		int fuelcells = 0;
		int choice = 0;

		for (int Counter = 0; Counter <= 9; Counter++) { //Counter to track the number of fuel cells taken
			System.out.printf("Would you like to take a fuel cell?%n"
					+ "1. Yes%n"
					+ "2. No%n");
			choice = scanner.nextInt();

			if (choice == 1) {
				fuelcells += 1;
			}	
		}

		System.out.printf("You took %d Fuel Cells%n", fuelcells);
		if (fuelcells <= 5) {//If the Player takes 5 or less fuel cells

			System.out.printf("Allowing the other ship to keep the rest of their fuel%n"
					+ "%n");
			shipStatus.fuelLevel = 5;

			System.out.printf("Would you like to return to the Nightfall?%n");
			System.out.printf("1. Yes%n");
			System.out.printf("2. No%n");		

			Integer input = scanner.nextInt();
			while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

			if (input == 1) {
				changeFuel.displayStatus();
			}
		}
		else { //If the player takes more than 5 fuel cells
			System.out.println("Draining the other ship of its fuel and leaving them stranded\n"
					+ "\n");
			shipStatus.fuelLevel = 10;

			System.out.printf("Would you like to return to the Nightfall?%n");
			System.out.printf("1. Yes%n");
			System.out.printf("2. No%n");

			Integer input = scanner.nextInt();
			while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

			if (input == 1) {
				changeFuel.displayStatus();
			}
		}

	}
}
