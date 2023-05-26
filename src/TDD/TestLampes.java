package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestLampes {
    @Test
    public void testLampe() {
        Lampe lampe = new LampeSalon();
        assertFalse(lampe.estAllumee());
        
        lampe.allumer();
        assertTrue(lampe.estAllumee());
        
        lampe.eteindre();
        assertFalse(lampe.estAllumee());
    }
}
