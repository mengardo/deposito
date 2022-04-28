import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest4 {

	@Test
	public void testEstaLleno() {
        DepositoCombustible tanque = new DepositoCombustible(100.0,100.0);
        boolean comprobar = tanque.estaLleno();
        assertEquals(true,comprobar);
	}

}
