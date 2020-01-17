import java.util.InputMismatchException;
import java.util.Scanner;

public class Nightfall {

	private enum Status {WON, LOST}; 

	private static Scanner scanner;

	static Status gameStatus;

	public static void main(String[] args) {

		int clearScreen = 0;

		scanner = new Scanner(System.in);

		/*System.out.println("Please enter your username:"); //Game start
		String userName = scanner.nextLine();*/

		System.out.printf("<<Welcome to the USS Nightfall, Commander %s>>%n", args[0]);
		System.out.printf("<<Your ship has crashed on an unknown planet following a power plant and subesquent Jump Drive malfunction.>>%n");
		System.out.printf("<<Your first priority, Commander %s, should be survival, this ship can serve as a temporary shelter until you can find a way to get off this planet.>>%n", args[0]);
		System.out.printf("<<My survival algorithms calculate that the best way to survive this to find a way to get the Nightfall spaceworthy again.>>%n");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("<<Commander %s, would you like to:>>%n", args[0]);
		System.out.printf("1. View current ship status%n");
		System.out.printf("2. View planet information%n");
		System.out.printf("3. Leave the ship%n");
		System.out.printf("4. Leave this planet%n");
		
		int input1 = scanner.nextInt(); //Input from player regarding with menu selection to make
		while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

		gameMenu(input1);
		
		
	}

	public static void gameMenu(int choice) {
		shipStatus currentShipStatus = new shipStatus(); //shipStatus object
		planetAreas areas = new planetAreas(); //planetInfo object

		if (choice == 1) { //Displaying ship status
			currentShipStatus.displayStatus();
		}

		else if (choice == 2) { //Displaying planet info
			areas.planetInfo();
		}

		else if (choice == 3) { //Leaving the ship
			areas.areaSelect();
		}
		else if (choice == 4) { //Leaving the ship
			gameEnd();
		}
	}

	public static void setGameStatus() {

		shipStatus currentShipStatus = new shipStatus();

		currentShipStatus.checkShip();

		if (currentShipStatus.shipComplete == true) {
			gameStatus = Status.WON;
		}
		else {
			gameStatus = Status.LOST;
		}
	}

	public static void gameEnd () {
		setGameStatus();

		shipStatus currentShipStatus = new shipStatus();

		if (gameStatus == Status.WON) {
			System.out.println("All the modules are fixed to workable levels.\n"
					+ "You decide its time to leave this rock.\n"
					+ "You start the ship and for once everything goes right.\n"
					+ "The ship lifts off and you see the planet fade into the darkness of space as you leave it behind, never to return.\n");
			credits();
		}
		else if (gameStatus == Status.LOST) {
			System.out.println("The ship is unable to start, try fixing all of the damaged modules");
			currentShipStatus.displayStatus();
		}
		else if ((gameStatus == Status.LOST) && (currentShipStatus.jumpDrive != 0)) {
			System.out.println("The Nightfall starts without a problem, but upon starting a jump, the Jump Drive goes critical and forces you to return to the surface.");
			currentShipStatus.displayStatus();	
		}
	}
	
	public static void credits() {
		System.out.printf("Thank you for playing!%n"
				+ "The way the story of this game is told was inspired by the roleplaying game Dungeons & Dragons.%n"
				+ "A majority of the concepts in this game where based off of the space sim 'Elite: Dangerous'.%n"
				+ "The alien races are inspired by the alien races in 'Elite: Dangerous'.%n"
				+ "The appearance of the Nightfall is never described, because I wanted players to imagnine the ship how they want. %n"
				+ "But if you want to know what I intended the ship to look like: google 'Elite Dangerous Federal Corvette'.%n"
				+ "The last credit goes to the 4X RTS game 'Stellaris' for inspiring a number of the puzzles.%n"
				+ "I hope you enjoyed Nightfall, Thank you for playing!");
	}
}
