import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
        DepositoCombustible tanque = new DepositoCombustible(100.0,30.0);
        double litros = tanque.getDepositoNivel();
        assertEquals(30.0,litros,0.0);
	}

}
