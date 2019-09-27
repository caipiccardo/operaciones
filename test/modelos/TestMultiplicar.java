
package modelos;

import modelo.OperacionesBasicas;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestMultiplicar {
 
    @Test
    public void testMultiplicar(){
      
        System.out.println("Multiplicar");
        OperacionesBasicas instance = new OperacionesBasicas(8,0);
        assertTrue(instance.multiplicar()==1);

       
    }
}
