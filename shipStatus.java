import java.util.InputMismatchException;
import java.util.Scanner;

public class shipStatus {

	int clearScreen;
	int lifeSupport = 1;
	static int thrusters;
	static int powerPlant;
	static int jumpDrive;

	static int fuelLevel = 0;

	static boolean shipComplete = false;

	Scanner scanner = new Scanner(System.in);
	static planetAreas areas = new planetAreas();
	static Nightfall fall = new Nightfall();

	public void displayStatus() { //Method containing logic to display the whole ship's status

		System.out.printf("<<Now displaying current ship status:>>%n");
		System.out.println("-----------------------------------------------------------------");
		System.out.println(lifeSupport == 1 ? "Life Support: Online" : "Life Support: Offline");
		System.out.println(thrusters == 1 ? "Thrusters: Online" : "Thrusters: Offline");
		System.out.println(powerPlant == 1 ? "Power Plant: Online" : "Power Plant: Offline");
		System.out.println(jumpDrive == 1 ? "Jump Drive: Online" : "JumpDrive: Offline");

		if (fuelLevel == 0) {
			System.out.println("Fuel Level: Empty");
		}
		else if (fuelLevel <= 5 ) {
			System.out.println("Fuel Level: Low");
		}
		else if (fuelLevel == 10) {
			System.out.println("Fuel Level: Full");
		}

		System.out.printf("<<All of the modules must be fixed before attempting launch, and the fuel tank must be half filled, if you want to be risky, Commander.>>%n"
				+ "%n");
		try {
			System.out.printf("Would you like to:%n");
			System.out.printf("1. Leave the ship%n");
			System.out.printf("2. View Planet Information%n");
			System.out.printf("3. Leave this planet%n");

			int input2 = scanner.nextInt();
			while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

			if (input2 == 1) {
				areas.areaSelect();
			}

			else if (input2 == 2) {
				areas.planetInfo();
			}
			else if (input2 == 3) {
				fall.gameEnd();
			}
		}
		catch (InputMismatchException e){
			System.out.println(e);
		}
	}

	public boolean checkShip () {
		if (thrusters == 1 && powerPlant == 1 && jumpDrive == 1 && fuelLevel >= 5) {
			shipComplete = true;
		}
		else {
			shipComplete = false;
		}

		return shipComplete;
	}
}

