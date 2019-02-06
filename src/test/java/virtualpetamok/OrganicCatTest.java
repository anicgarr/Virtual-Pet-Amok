package virtualpetamok;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OrganicCatTest {



	@Test
	public void organic_cat_class_extends_organicpet() {
		OrganicCat pet=new OrganicCat("hh","hjh");
assertThat(pet,instanceOf(OrganicPet.class));
	}
	

	}
		
	

