import java.util.Scanner;
import java.util.Random;

public class mountains {

	shipStatus changeThruster = new shipStatus(); //shipStatus object
	Scanner scanner = new Scanner(System.in);

	int clearScreen;

	int randomWithRange (int min, int max) { //Random Class
		Random random = new Random();
		return random.nextInt((max - min) + 1) + min;
	}

	public void startMountains() {
		System.out.printf("You have arrived in the mountains.%n");
		System.out.printf("The mountains are a massive jumble of cliff faces and craggy peaks.%n");
		System.out.printf("Some of the peaks reach into the red sky and disappear into the thick orange clouds.%n");
		System.out.printf("On a lower plateau whitin climbing distance, you can see what is left of an old wreck.%n"
				+ "%n");
		System.out.printf("Would you like to climb?.%n");
		System.out.printf("1. Yes%n");
		System.out.printf("2. No%n");

		int input2 = scanner.nextInt();
		while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

		if (input2 == 1) {
			System.out.printf("It was a hard climb but you made it to the plateau.%n");
			System.out.printf("All around you see an old wreck of a Union ship, maybe you can salvage something.%n");
			mountians();
		}

		else {
			System.exit(0);
		}
	}

	public void mountians() {

		int killChance;

		System.out.printf("You can either approach the wreck itself or you could look around the area that the wreck is in.%n");
		System.out.printf("1. Approach the wreck%n");
		System.out.printf("2. Search the area%n");

		int input = scanner.nextInt();
		while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

		if (input == 1) {
			System.out.printf("As you take a step towards the wreck, you hear skittering sounds.%n");
			System.out.printf("What do you do?%n");
			System.out.printf("1. Pull out Blaster and continue approach%n");
			System.out.printf("2. Continue approach slowly%n");
			System.out.printf("3. Back away%n");

			int alienInput = scanner.nextInt();
			while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

			if (alienInput == 1) { //Logic for the players decision on what to do about the alien
				System.out.printf("You see a Shytoklath emerge from the wreckage, you have never seen one in person but you have heard the stories about how dangerous they are%n");
				System.out.printf("The Shytoklath lets out a bloodcurdling shriek and begins to race towards you%n");
				System.out.printf("What do you do?%n");

				System.out.printf("1. Shoot!%n");
				System.out.printf("2. Run!%n");

				int combatInput = scanner.nextInt();
				while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

				if (combatInput == 1) { //Combat logic
					killChance = randomWithRange(1, 2);
					if (killChance == 1) {//Killing the Alien
						System.out.printf("You take a shot, the shot hits the Shytoklath square in the chest and it collapses on the ground dead.%n");
						System.out.printf("The Shytoklath drops something when it died.%n");
						System.out.printf("It has the thruster component! You have found the thruster component!%n"); 
						System.out.printf("Its an old unit, but anything is better than the busted unit back at the Nightfall.%n"); 
						shipStatus.thrusters = 1;

						System.out.printf("Would you like to return to the Nightfall?%n");
						System.out.printf("1. Yes%n"); 
						System.out.printf("2. No%n");

						int input3 = scanner.nextInt();
						while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

						if (input3 == 1) { 
							changeThruster.displayStatus(); 
						} 
						else { 
							System.exit(0); 
						}
					}
					else {//Not killing alien, game starts from checkpoint
						System.out.printf("Your shot misses the Shytoklath, it reaches you before you can make a second shot%n");
						System.out.printf("You where killed by the Shytoklath, would you like to try again?%n");
						System.out.printf("1. Yes%n");
						System.out.printf("2. No%n");

						int deathInput = scanner.nextInt();
						while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

						if (deathInput == 1) {//Checkpoint 
							mountians();
						}
						else {
							System.exit(0);
						}
					}
				}

				else if (combatInput == 2) {
					System.out.printf("You attempt to outrun the Shytoklath, but the Shytoklath is faster, also you reached the edge of the cliff, you have no where to go%n");
					System.out.printf("You where killed by the Shytoklath, would you like to try again?%n");
					System.out.printf("1. Yes%n");
					System.out.printf("2. No%n");

					int deathInput = scanner.nextInt();
					while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

					if (deathInput == 1) {
						mountians();
					}
					else {
						System.exit(0);
					}
				}

			}
			else if (alienInput == 2) {//Sneaking up on the alien with a slow approch
				System.out.printf("When you peak around a chunk of the hull, you see a Shytoklath digging around, as if it was looking for something.%n"); 
				System.out.printf("You have heard about how deadly these things are.%n"
						+ "%n"
						+ "What do you do?%n"
						+ "1. Shoot it%n"
						+ "2. Distract it%n");

				int slowInput = scanner.nextInt();
				while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

				if (slowInput == 1) {
					killChance = randomWithRange(1, 2);
					if (killChance == 1) {
						System.out.printf("You take a shot, the shot hits the Shytoklath square in the chest and it collapses on the ground dead.%n");
						System.out.printf("The Shytoklath drops something when it died.%n");
						System.out.printf("It has the thruster component! You have found the thruster component!%n"); 
						System.out.printf("Its an old unit, but anything is better than the busted unit back at the Nightfall.%n"
								+ "%n"); 
						shipStatus.thrusters = 1;

						System.out.printf("Would you like to return to the Nightfall?%n");
						System.out.printf("1. Yes%n"); 
						System.out.printf("2. No%n");

						int input3 = scanner.nextInt();
						while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

						if (input3 == 1) { 
							changeThruster.displayStatus(); 
						} 
						else { 
							System.exit(0); 
						}
					}
					else {
						System.out.printf("Your shot misses the Shytoklath, it reaches you before you can make a second shot%n");
						System.out.printf("You where killed by the Shytoklath, would you like to try again?%n");
						System.out.printf("1. Yes%n");
						System.out.printf("2. No%n");

						int deathInput = scanner.nextInt();
						while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

						if (deathInput == 1) {
							mountians();
						}
						else {
							System.exit(0);
						}
					}
				}
				else {
					System.out.printf("You pick up a nearby rock and toss it a distance.%n"
							+ "The Shytoklath startles and speeds off into a nearby cave entrance.%n"
							+ "You probably don't want to follow it.%n"
							+ "You look around and don't find whatever it was the alien was looking for.%n"
							+ "%n"
							+ "Do you look around?%n"
							+ "1. Yes%n"
							+ "2. No%n");
					int input4 = scanner.nextInt();
					while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

					if (input4 == 1) {
						aroundWreck();
					}
					else  {
						System.exit(0);
					}
				}	
			}
			else {
				mountians();
			}
		}

		else if (input == 2) {
			aroundWreck();
		}
	}


	public void aroundWreck() { //The area around the wreck of the ship
		boolean hasThruster = false;

		int chance;

		do {
			System.out.printf("Would you like to look around the rocks?%n");
			System.out.printf("1. Yes%n"); 
			System.out.printf("2. No%n");

			int input2 = scanner.nextInt();

			if (input2 == 1) { 
				chance = randomWithRange(1, 3);

				if (chance == 1) { 
					hasThruster = true;

					System.out.printf("You have found the thruster component!%n"); 
					System.out.printf("Its an old unit, but anything is better than the busted unit back at the Nightfall.%n"
							+ "%n"); 
					shipStatus.thrusters = 1;

					System.out.printf("Would you like to return to the Nightfall?%n");
					System.out.printf("1. Yes%n"); 
					System.out.printf("2. No%n");

					int input3 = scanner.nextInt();
					while (clearScreen < 50) {System.out.println("\n"); clearScreen++;}

					if (input3 == 1) { 
						changeThruster.displayStatus(); 
					} 
					else { 
						System.exit(0); 
					}
				}
				else {
					System.out.printf("You didn't find anything%n");
				}
			}

			else { 
				System.exit(0); 
			}

		} while (hasThruster == false);
	}
}

