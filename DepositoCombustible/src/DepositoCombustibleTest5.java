import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest5 {

	@Test
	public void testFill() {
        DepositoCombustible tanque = new DepositoCombustible(100.0,0.0);
        tanque.fill(20.0);
        double litros = tanque.getDepositoNivel();
        assertEquals(20.0,litros,0.0);        
	}

}
