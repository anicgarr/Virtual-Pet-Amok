package virtualpetamok;

public abstract class RoboticPet extends VirtualPet {
	
	public RoboticPet(String name, String description) {
		super(name, description);

	}


	protected int oilLevel=20;


	public int getOilLevel() {
		return oilLevel;
	}

	public void setOilLevel(int oilLevel) {
		this.oilLevel = oilLevel;
	}

	public void oil() {
		oilLevel+=10;
	}
	
	@Override
	public void tick() {
		oilLevel-=2;
		
	}

	@Override
	public void healthChange() {
		
		if(oilLevel >=0|oilLevel<10) {
			health-=2;
		}
		if(oilLevel>=10||oilLevel<20) {
			health-=5;
		}
		if(oilLevel >=20){
			health-=10;
		}
	}

	


	
}
