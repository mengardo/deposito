import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest3 {

	@Test
	public void testEstaVacio() {
        DepositoCombustible tanque = new DepositoCombustible(100.0,0.0);
        boolean comprobar = tanque.estaVacio();
        assertEquals(true,comprobar);
        
	}

}
