package virtualpetamok;

public abstract class VirtualPet {
//instance variables
	protected int health=10;
	protected int happiness=10;
	private int boredom=0;
	private int energy=10;
	private String name;
	private String description;
	
	
	
	public VirtualPet(String name, String description) {	
		this.name=name;
		this.setDescription(description);
	
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	

	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy=energy;
	}
	

	public int getBoredom() {
		return boredom;
	}
	public int setBoredom (int boredom) {
		 return this.boredom=boredom;
	}
	
	public int getHappiness() {
		return happiness;
	}
	public void setHappiness() {
		this.happiness=happiness;
	}
	public int getHealth() {
		return health;
	}
	
	public void setHealth() {
		this.health=health;
	}
	
	
	public void tick() {
		healthChange();
		
	}
	
	public abstract void healthChange();



public void layDownForNap() {
	this.energy=+5;
}
public void play() {
	this.boredom=-5;
}





public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
	


