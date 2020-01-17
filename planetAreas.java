import java.util.Scanner;

public class planetAreas {

	Scanner scanner = new Scanner(System.in);
	static shipStatus ShipState = new shipStatus(); //shipStatus object
	
	int clearScreen;

	public void planetInfo() { //Describing the planet

		System.out.printf("<<Starting planetary surface scan...>>%n");
		System.out.printf("...%n");
		System.out.printf("<<Scan complete--displaying results now, Commander.>>%n");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("<<The atmosphere is ammoina based, my survival protocol recomends that you keep your helmet on while outside of the ship.>> %n");
		System.out.printf("<<Scans also indicate signs of advanced life, although they are not definative, I recommend caution.>> %n");
		System.out.printf("<<This planet seems to be also a starship graveyard. Which is a stroke of good luck.>> %n");
		System.out.printf("<<I have marked seven locations that possibly contain parts that can be used to fix the ship.>> %n");
		System.out.printf("<<1. The Mountians, there is a mountian range with high possiblty of having what we need.>> %n");
		System.out.printf("<<2. Crystalline Forest, High volumes of energy have been detected.>> %n");
		System.out.printf("<<3. Unknown Ruins have been located to the west, these ruins don't match any recorded.>> %n");
		System.out.printf("<<4. A Distress Signal, sensors picked up a weakened USS distress signal to the north, it might be worth a look.>> %n"
				+ "%n");

		System.out.printf("Would you like to:%n");
		System.out.printf("1. Leave the ship%n");
		System.out.printf("2. View Ship Information%n");

		int input = scanner.nextInt();
		while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

		if (input == 1) {
			areaSelect();
		}

		else if (input == 2) {
			ShipState.displayStatus();
		}

	}


	public void areaSelect() { //Player selecting an area to go to
		System.out.printf("<<Commander, Where would you like to go?>> %n");

		System.out.printf("1. Mountains %n");
		System.out.printf("2. Crystalline Forest %n");
		System.out.printf("3. Unknown Ruins %n");
		System.out.printf("4. Distress Signal %n");

		int input = scanner.nextInt();

		mountains mountain = new mountains();
		distressSignal signal = new distressSignal();
		ruins ruin = new ruins();
		crystal forest = new crystal();

		if (input == 1) {
			mountain.startMountains();
		}
		else if (input == 2) {
			forest.startForest();
		}

		else if (input == 3) {
			ruin.ruinStart();
		}

		else if (input == 4) {
			signal.startdistressSignal();
		}

	}

}

