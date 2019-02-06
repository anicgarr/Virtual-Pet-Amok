package virtualpetamok;

public class RoboticDog extends RoboticPet {

	public RoboticDog(String name, String description) {
		super(name, description);
		
	}

	public void walk() {
		this.happiness +=5;
	}
	
	public void oilPet() {
		this.oilLevel+=5;
	}

	

}
