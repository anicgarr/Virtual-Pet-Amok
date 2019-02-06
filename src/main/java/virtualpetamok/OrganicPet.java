package virtualpetamok;

public abstract class OrganicPet extends VirtualPet {

	
	public OrganicPet(String name, String description) {
		super(name, description);
	
	}

	private int hunger=5;
	private int thirst=10;
	protected int wasteLevel=20;

	public int getHunger() {
		return hunger;
	}


	public int getThirst() {
		return thirst;
	}
	
	public int getWasteLevel() {
		return wasteLevel;
	}
	
	@Override
	public void tick() {
		thirst+=2;
		hunger+=2;
		wasteLevel+=2;
	
	}
	
	
public void feedPet(){
this.hunger-=5;
this.thirst+=5;
this.wasteLevel+=5;
}

public void giveWater() {
	this.thirst-=5;
}

@Override 
public void healthChange() {
if(hunger >=0||hunger<10) {
	health-=2;
}
if(hunger>=10||hunger<20) {
	health-=5;
}
if(hunger >=20){
	health-=10;
}

if(wasteLevel >=0||wasteLevel<10) {
	health-=2;
}
if(wasteLevel>=10||wasteLevel<20) {
	health-=5;
}
if(wasteLevel >=20){
	health-=10;
}

if(thirst >=0||thirst<10) {
	health-=2;
}
if(thirst>=10||thirst<20) {
	health-=5;
}
if(thirst >=20){
	health-=10;
}
	}
//	int check=this.hunger;
//	if(this.hunger>(check+2)) {
//	for(int hunger=0;hunger>0;hunger++) {
//		health-=2;
//	}
//	for(int wasteLevel=0;wasteLevel>0;wasteLevel++) {
//		health-=2;
//	}
//	for( int thirst=0;thirst>0;thirst++) {
//		health-=2;
//	}


}

