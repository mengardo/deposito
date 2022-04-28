import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest2 {

	@Test
	public void testGetDepositoMax() {
        DepositoCombustible tanque = new DepositoCombustible(100.0,30.0);
        double litros = tanque.getDepositoMax();
        assertEquals(100.0,litros,0.0);
	}

}
