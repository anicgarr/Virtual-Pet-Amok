package virtualpetamok;

import java.util.Collection;
import java.util.Scanner;

public class VitrualPetShelterApp {

	private static String description;
	private static String name;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter allPets = new VirtualPetShelter();
		OrganicCat Niko = new OrganicCat("Niko", "Organic Cat");
		OrganicCat Randi = new OrganicCat("Randi","Organic Cat");
		RoboticCat Moochi = new RoboticCat("Moochi", "Robotic Cat");
		RoboticCat Naya=new RoboticCat("Naya", "Robotic Cat");
		OrganicDog Blade = new OrganicDog("Blade", "Organic Dog");
		OrganicDog Noggin = new OrganicDog("Noggin", "Organic Dog");
		RoboticDog Kobe = new RoboticDog("Kobe", "Robotic Dog");
		RoboticDog Aremis = new RoboticDog("Aremis", "Robotic Dog");


		allPets.add(Niko);
		allPets.add(Moochi);
		allPets.add(Blade);
		allPets.add(Kobe);
		allPets.add(Randi);
		allPets.add(Aremis);
		allPets.add(Noggin);
		allPets.add(Naya);

		Collection<VirtualPet> petCollection = allPets.getAllPets();

		System.out.println("Welcome to the WCCI Pet Shelter");

		System.out.println("Enter 1 to feed all the pets ");
		System.out.println("2 to give water to all the pets");
		System.out.println("3 to play with an individual pet");
		System.out.println("4 to allow adoption of a pet");
		System.out.println
		("5 to allow intake of a pet");
		System.out.println("6 to get pet statuses");
		System.out.println("7 to walk all dogs");
		System.out.println("8 to clean dog cages");
		System.out.println("9 to clean the shelter litterbox");
		System.out.println("10 to oil all robotic pets");
		System.out.println("11 to quit");

		do {
			allPets.tickAllPets(petCollection);
		
			System.out.println("What would you like to do now?");
			int desiredAction = input.nextInt();

			if (desiredAction == 1) {
				allPets.feedAllOrganicPets();

				System.out.println("Your pets are eating...");

			} else if (desiredAction == 2) {
				allPets.waterAllOrganicPets();
				System.out.println("Your pets are drinking water...");

			} else if (desiredAction == 3) {
				System.out.println("What pet would you like to play with? Enter their name");

do {
				for (VirtualPet pet : petCollection) {
					System.out.println(pet.getName());
				}
		
				String desiredPetToPlay = input.next();
				VirtualPet playedPet = allPets.findPetToPlay(desiredPetToPlay);
				if (petCollection.contains(playedPet)) { 
					playedPet.play();
					System.out.println("You are playing with " + desiredPetToPlay);
					break;
				}else {		
					System.out.println("That pet isn't in this shelter. Please choose one from the list");
				}

				
			}
while(true);
			}else if (desiredAction == 4) {
				System.out.println("Who would you like to adopt? Enter their name.");
		do {
				for (VirtualPet pet : petCollection) {
					System.out.println(pet.getName());
				}
				String desiredPetToAdopt = input.next();
				VirtualPet adoptedPet = allPets.findPetToAdopt(desiredPetToAdopt);

				if (petCollection.contains(adoptedPet)) {
					allPets.adopt(adoptedPet);
System.out.println("Thank you for helping " + adoptedPet.getName() + " find a good home.");
					break;
				} else {
					System.out.println("That's not a valid choice. Try Again.");
				}

			}while(true);
			}else if (desiredAction == 5) {
				System.out.println("What is your new pet's name?");
				String intakePetName=input.next();
				System.out.println("Briefly describe your pet:");
				String intakePetDescrption=input.next();
				System.out.println("What type of pet is this? Enter 1 for organic cat, 2 for organic dog, 3 for robotic dog and 4 for robotic cat.");
				int typeOfIntakePet=input.nextInt();
				switch(typeOfIntakePet) {
				case 1: 
					VirtualPet intakePet=new OrganicCat(intakePetName,description);
					allPets.add(intakePet);
					System.out.println("You have added " +intakePetName +" to the shelter!");

					break;
				case 2:
					VirtualPet intakePet2=new OrganicDog(intakePetName,description);
					allPets.add(intakePet2);
					System.out.println("You have added " +intakePetName +" to the shelter!");

					break;
				case 3:
					VirtualPet intakePet3=new RoboticDog(intakePetName,description);
					allPets.add(intakePet3);
					System.out.println("You have added " +intakePetName +" to the shelter!");

					break;
				case 4:
					VirtualPet intakePet4=new RoboticCat(intakePetName,description);
					allPets.add(intakePet4);
				System.out.println("You have added " +intakePetName +" to the shelter!");
				break;
				}
			} else if (desiredAction == 6) {
				allPets.getStatuses(petCollection);
			} else if (desiredAction == 7) {
				allPets.walkAllDogs();
			}  else if (desiredAction == 8) {
				allPets.cleanDogCages();
			} else if (desiredAction == 9) {
allPets.cleanLitterBox();			
} 
		else if (desiredAction == 10) {
			allPets.oilAllRoboticPets();
			} 
			else if (desiredAction == 11) {
				System.out.println("Goodbye!");
				System.exit(0);
			}else {
				System.out.println("That's not a valid choice. Try Again.");
			}

		}

		while (true);
	}

	private static VirtualPet OrganicCat(String intakePetName, String description2) {
		// TODO Auto-generated method stub
		return null;
	}
}
