
package modelos;

import modelo.OperacionesBasicas;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestDividir {
    @Test
     public void testDividir(){
    
        System.out.println("Dividir");
        OperacionesBasicas instance = new OperacionesBasicas(8,0);
        assertTrue(instance.dividir()==0);

        
}
}
