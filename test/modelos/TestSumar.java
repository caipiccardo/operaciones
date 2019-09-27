
package modelos;

import modelo.OperacionesBasicas;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestSumar {
    @Test
    public void testSumar(){
        
        System.out.println("Sumar");
        OperacionesBasicas instance = new OperacionesBasicas(1,0);
        assertTrue(instance.sumar()==0);

    }
}
