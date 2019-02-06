package virtualpetamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private static final int VirtualPet = 0;
	private static final int Collection = 0;
	Map<String, VirtualPet> allPets = new HashMap<>();// <string, virtual pet object>
	private Object name;

	public void add(VirtualPet pet) {
		allPets.put(pet.getName(), pet);
	}

	public VirtualPet findPetToPlay(String desiredPetToPlay) {
		return allPets.get(name);
	}
	public VirtualPet findPetToAdopt(String desiredPetToAdopt) {
		return allPets.get(name);
	}

	public Collection<VirtualPet> getAllPets() {
		return allPets.values();
	}

	public void adopt(VirtualPet pet) {
		allPets.remove(pet.getName(), pet);
	}

	public void playWithPet(String name) {
		allPets.get(name).play();
	}

	public void feedAllOrganicPets() {
		for (VirtualPet pet : allPets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feedPet();
			}
		}
	}

	public void waterAllOrganicPets() {
		for (VirtualPet pet : allPets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).giveWater();

			}

		}
		
	}
	public void walkAllDogs() {
		for (VirtualPet pet : allPets.values()) {
			if (pet instanceof OrganicDog||pet instanceof RoboticDog) {
				((OrganicDog) pet).walk();
				((RoboticDog)pet).walk();

			}
		}
		}
	public void oilAllRoboticPets() {
		for (VirtualPet pet : allPets.values()) {
			if (pet instanceof RoboticPet) {
				((RoboticPet) pet).oil();
				

			}
		}
		}
	public void tickAllPets(Collection<VirtualPet> allPets) {
		for (VirtualPet pet : allPets) {
			pet.tick();
		}
	}
	

	public void getStatuses(Collection<VirtualPet> allPets) {
		System.out.println("NAME\t|OILLEVEL|HEALTH|BOREDOM|");
		System.out.println("_______|_______|_______|________|");

		for (VirtualPet pet : allPets) {
			if (pet instanceof RoboticPet) {
				System.out.println("________________________________");

			System.out.println(pet.getName() +"\t|"+((RoboticPet)pet).getOilLevel()+"\t|"
					+ pet.getHealth()+"\t|"+pet.getBoredom());
		}
		}
		System.out.println("NAME\t|HUNGER\t|THIRST\t|BOREDOM|WASTELEVEL|HEALTH");
		System.out.println("________|_______|______|________|_________|_________");
		for (VirtualPet pet : allPets) {
			if (pet instanceof OrganicPet) {
				
				System.out.println("______________________________________________");
				System.out.println(pet.getName() + "\t| " + ((OrganicPet) pet).getHunger() + "\t|" +((OrganicPet)pet).getThirst() + "\t|"
						+ pet.getBoredom() + "\t|"+ ((OrganicPet) pet).getWasteLevel() +"\t|"+pet.getHealth());
			}
		}
	}

	public void cleanLitterBox() {
		for (VirtualPet pet : allPets.values()) {
			if (pet instanceof OrganicCat)
				((OrganicCat) pet).cleanOrganicCatLitterBox();
	}
	}

	public void cleanDogCages() {
		for (VirtualPet pet : allPets.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog)pet).cleanOrganicDogCages();
	}


}
	}
}
