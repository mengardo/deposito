import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest6 {

	@Test
	public void testConsumir() {
        DepositoCombustible tanque = new DepositoCombustible(100.0,50.0);
        tanque.consumir(10.0);
        double litros = tanque.getDepositoNivel();
        assertEquals(40.0,litros,0.0);  
	}

}
