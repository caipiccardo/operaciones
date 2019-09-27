
package guia1git;

import java.util.Scanner;
import modelo.OperacionesBasicas;

public class main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese a: ");
        double a = s.nextDouble();
        System.out.println("Ingrese b: ");
        double b = s.nextDouble();
        
        OperacionesBasicas ob = new OperacionesBasicas();
        System.out.println("suma");
        System.out.println(ob.sumar(a,b));
        System.out.println("resta");
        System.out.println(ob.restar(a,b));
        System.out.println("multiplicacion");
        System.out.println(ob.multiplicar(a,b));
        System.out.println("division");
        System.out.println(ob.dividir(a,b));
    }
    
}
