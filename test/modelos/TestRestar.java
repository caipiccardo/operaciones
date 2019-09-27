
package modelos;

import modelo.OperacionesBasicas;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestRestar {
    @Test
    public void testRestar(){
        
        System.out.println("Restar");
        OperacionesBasicas instance = new OperacionesBasicas(1,5);
        assertTrue(instance.restar()==0);

    }
}
