package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCommandes {
	 @Test
	    public void testCommandes() {
	        Lampe lampe = new LampeCuisine();
	        ICommand allumer = new AllumerLampeCommand(lampe);
	        ICommand eteindre = new EteindreLampeCommand(lampe);
	        
	        allumer.execute();
	        assertTrue(lampe.estAllumee());

	        eteindre.execute();
	        assertFalse(lampe.estAllumee());
	    }
}
