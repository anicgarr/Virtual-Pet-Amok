package virtualpetamok;

public class OrganicDog extends OrganicPet {

	
public OrganicDog(String name, String description) {
		super(name, description);
	
}
public void walk() {
	this.happiness+=5;
	this.wasteLevel-=15;
	}

public void cleanOrganicDogCages() {
	this.wasteLevel-=50;
}



}
