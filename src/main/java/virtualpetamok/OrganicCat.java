package virtualpetamok;

import javax.lang.model.util.Elements;

public class OrganicCat extends OrganicPet {

	public int wasteLevel = 5;

	public OrganicCat(String name, String description) {
		super(name, description);
	}

//	public boolean isLitterBoxDirty() {
//		if (organicCatsWasteLevel > 50) {
//			System.out.println("Litter box is dirty. Please clean it.");
//			return true;
//		} else {
//			return false;
//		}

	public void cleanOrganicCatLitterBox() {
		wasteLevel += 3;
	}

	
	
		
	}


