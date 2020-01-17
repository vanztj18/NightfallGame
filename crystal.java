import java.util.Scanner;

public class crystal {

	private enum Status {STAYED, ESCAPED}; 

	static Status situationStatus;

	int clearScreen;

	Scanner scanner = new Scanner(System.in);

	public void startForest() {

		System.out.printf("You arrive at what looks like the crystal forest.%n"
				+ "Vibrant trees of different color crystals occasionally have electricty arcing between them.%n"
				+ "As you step into the forest the trees around you start glowing and you hear <<Comman-- ps1on1c ener surg3 d3tect>>%n"
				+ "And then all you hear from inside your helmet is static, but the static is piericing and hurts to listen to.%n"
				+ "Do you take off your helmet?%n"
				+ "1. Yes, take off the helmet%n"
				+ "2. No, keep the helmet on%n");

		int input = scanner.nextInt();

		if (input == 1) {
			System.out.println("You take your helmet off, only to realize that the static wasn't from the helmet, but it was in your head. \n"
					+ "you start to feel like you are going to pass out.\n"
					+  "When you take a few steps forward, you trip and fall, starting to lose consciousness.\n"
					+ "As your vision fades, the last thing you see is the purple crystal trees arcing energy above you.\n"
					+ "You hear <<Commander, shields are offline>> \n"
					+ "And as your vision comes back into focus, you see that you aren't in a Crystal Forest or even on that planet, \n"
					+ "You are in the pilot seat of the Nightfall, in space.\n"
					+ "As you come to your senses, you realize that not only are you in space, you are in combat, as you notice the myriad of ships infront of you, blasting each other with various explosives, lasers, and multicannons.\n"
					+ "You also realize that the Nightfalls shield is down, which is unusual, the Nightfall is a civilian battleship with military grade shields, they don't go down easy.\n"
					+ "As a blast rocks the ship, you notice cracks appearing in the canopy of the ship.\n"
					+ "<<Canopy at 75%, Commander, an escape plan is advised>>\n"
					+ "You are still out of mind at the moment, but you remember that doing a hyperspace jump is usually the best way to escape combat, with a ship the size of the Nightfall.\n"
					+ "You go the engage the jump and hear <<Jump Drive engaged>>\n"
					+ "But then another blast rocks the ship, and you hear <<Jump Drive malfunction, Jump failed, Canopy at 50%>>\n"
					+ "You have two options: \n"
					+ "1. Fight your way out\n"
					+ "2. Make for the escape pod\n");

			int input2 = scanner.nextInt();

			while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

			if (input2 == 1) {
				stay();
			}
			else {
				escape();		
			}

		}
		else {
			System.out.printf("You keep the helmet on, and the static becomes louder, you start to feel like you are going to pass out.%n");
			System.out.println("When you take a few steps forward, you trip and fall, starting to lose consciousness.\n"
					+ "As your vision fades, the last thing you see is the purple crystal trees arcing energy above you.\n"
					+ "You hear <<Commander, shields are offline>> \n"
					+ "And as your vision comes back into focus, you see that you aren't in a Crystal Forest or even on that planet, \n"
					+ "You are in the pilot seat of the Nightfall, in space.\n"
					+ "As you come to your senses, you realize that not only are you in space, you are in combat, as you notice the myriad of ships infront of you, blasting each other with various explosives, lasers, and multicannons.\n"
					+ "You also realize that the Nightfalls shield is down, which is unusual, the Nightfall is a civilian battleship with military grade shields, they don't go down easy.\n"
					+ "As a blast rocks the ship, you notice cracks appearing in the canopy of the ship.\n"
					+ "<<Canopy at 75%, Commander, an escape plan is advised>>\n"
					+ "You are still out of mind at the moment, but you remember that doing a hyperspace jump is usually the best way to escape combat, with a ship the size of the Nightfall.\n"
					+ "You go the engage the jump and hear <<Jump Drive engaged>>\n"
					+ "But then another blast rocks the ship, and you hear <<Jump Drive malfunction, Jump failed, Canopy at 50%>>\n"
					+ "You have two options: \n"
					+ "1. Fight your way out\n"
					+ "2. Make for the escape pod\n");

			int input2 = scanner.nextInt();

			while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

			if (input2 == 1) {
				stay();
			}
			else {
				escape();		
			}

		}



	}

	public void stay() {
		System.out.printf("You decide that the Nightfall is still a tough ship even without shields, you decide to stay and fight out the battle.%n"
				+ "You deploy weapons and target the nearest enemy ship.%n"
				+ "----------------------------------------------------------------------------------------------------------------------------------%n"
				+ "About 15 min later, you have taken out 5 enemy ships, your canopy shattered about 5 mintues ago, which was fine because you are magnetically attached to the pilots chair in case of this situation.%n"
				+ "You have 20 min of life support left.%n"
				+ "You hear extreme loud crackling noises, and then a loud bang as an enemy captial ship warps into battle.%n"
				+ "You feel the urge to jump away, but the jump drive is damaged, so you have no choice but to engage the captial ship.%n"
				+ "Do you:%n"
				+ "1. Target and attack the ship's heat exchangers, in an effort to overheat the ship%n"
				+ "2. Target and attack the ship's weapons systems, in an effort to make it less of a threat%n");

		int input2 = scanner.nextInt();
		while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

		if (input2 == 1) {
			System.out.printf("You decide to attack the heat exchangers, your scan reveals 4 exchangers.%n"
					+ "You take out 3 of the exchangers, taking fire from the captial ship. %n"
					+ "You get to the last exchanger, and you have one missile left, and your ship is in critical condition.%n"
					+ "You fire the last missile as the captial ship fire upon you, the missile hits the exchanger, your ship is hit by the barrage.%N"
					+ "As your ship explodes you see the captial ship overheat and jump away.%");
			situationStatus = Status.STAYED;
			jumpDrive();

		}
		else {
			System.out.printf("You decide to attack the ships weapons.%n"
					+ "You start attacking each weapon, trying to destroy it to no avail.%n"
					+ "Your ship thrusters gets hit critically locking them at top speed.%n"
					+ "You can still aim your ship though. %n"
					+ "The Nightfall is a big ship after all, so you decide to aim your ship at the captial ships bridge.%n"
					+ "You ram full speed into the bridge, destroying it.%n");
			situationStatus = Status.STAYED;
			jumpDrive();	
		}
	}

	public void escape() {
		System.out.printf("You stand up get over to the escape pod and at that moment another, larger blast rocks the ship.%n"
				+ "All sound stops as the canopy shatters, and you get sucked out into the void of space.%n"
				+ "You can breathe, as your life support suit activated as soon as it detected a lack of oxygen.%n"
				+ "You can do one of two things:%n"
				+ "1. Grab the front of the ship to stop yourself%n"
				+ "2. Accept fate, and hope a friendly pilot will pick you up before life support runs out%n");

		int input2 = scanner.nextInt();

		while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

		if (input2 == 1) {
			System.out.printf("You grab onto the front of the ship, stopping yourself.%n"
					+ "You start pulling yourself along the front of the ship towards the broken canopy to get back inside.%n"
					+ "Another blast rocks the ship, and you lose your grip and fly off.%n");
			fuelLine();
		}
		else {
			fuelLine();
		}
	}

	public void fuelLine() {
		System.out.printf("As you float farther away from the ship, you see a loose fuel line that is just within reach.%n");
		System.out.printf("You grab onto the fuel line and pull yourself back to the ship and into the broken canopy.%n"
				+ "As soon as you step back inside the ship you are blinded by a bright white flash.%n");
		situationStatus = Status.ESCAPED;
		jumpDrive();
	}

	public void jumpDrive() {
		shipStatus changeJumpDrive = new shipStatus(); 
		if (situationStatus == Status.STAYED) {
			System.out.printf("'Valiant Effort, Commander' Is what you hear as you wake up.%n"
					+ "You see that you are in the Crystal Forest, you also see an alien leaning against one of the trees.%n"
					+ "'You saw that there was no escape so you fought to the end and damaged a captial ship, assuring victory for your side, had it been real of course.'%n"
					+ "The alien looks similar to that of the descriptions of a Sentinel.%n"
					+ "'Such effort deserves a reward.' The alien hands you a crystal and says 'Replace the focusing crystal in your drive with that, it will get you where you need to go'%n"
					+ "With that the alien disappears, leaving you confused, but atleast you can fix the jump drive now.%n");
			shipStatus.jumpDrive = 1;

			System.out.printf("Would you like to return to the Nightfall?%n");
			System.out.printf("1. Yes%n");
			System.out.printf("2. No%n");		

			int input = scanner.nextInt();
			while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

			if (input == 1) {
				changeJumpDrive.displayStatus();
			}
		}
		else if (situationStatus== Status.ESCAPED) {
			System.out.printf("'Creative, Commander' Is what you hear as you wake up.%n"
					+ "You see that you are in the Crystal Forest, you also see an alien leaning against one of the trees.%n"
					+ "'You managed to escape a situation which most would not escape'%n"
					+ "The alien looks similar to that of the descriptions of a Sentinel.%n"
					+ "'Such effort deserves a reward.' The alien hands you a crystal and says 'Replace the focusing crystal in your drive with that, it will get you where you need to go'%n"
					+ "With that the alien disappears, leaving you confused, but atleast you can fix the jump drive now.%n");
			shipStatus.jumpDrive = 1;

			System.out.printf("Would you like to return to the Nightfall?%n");
			System.out.printf("1. Yes%n");
			System.out.printf("2. No%n");		

			int input = scanner.nextInt();
			while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

			if (input == 1) {
				changeJumpDrive.displayStatus();
			}
		}
	}
}

