package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class CommandInvoker {

@Test
public void testCommandInvoker() {
    Lampe lampe = new LampeChambre();
    ICommand allumer = new AllumerLampeCommand(lampe);
    ICommand eteindre = new EteindreLampeCommand(lampe);
    
    TestCommandInvoker invoker = new TestCommandInvoker();
    invoker.addICommand(allumer);
    invoker.executeICommands();
    
    assertTrue(lampe.estAllumee());
}
}