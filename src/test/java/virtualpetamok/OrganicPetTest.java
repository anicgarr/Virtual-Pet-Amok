package virtualpetamok;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
public class OrganicPetTest {

	@Test
	public void organicpetclass_extends_virtualpet() {
		OrganicPet pet=new OrganicPet("hh","hjh");
assertThat(pet,instanceOf(VirtualPet.class));
	}
	
	@Test
	public void hunger_level_starts_at_5() {
	OrganicPet pet=new OrganicPet("hh","hjh");
	assertThat(pet.getHunger(), is(5));
		
	}
	@Test
	public void feed_decreases_hunger_by_5() {
	OrganicPet pet= new OrganicPet("Rover","black dog");
	//System.out.println("hunger:"+ pet.getHunger());
		pet.feedPet();
		int currentHungerLevel=pet.getHunger();
		assertThat(currentHungerLevel, is(0));
	}
}
