
package modelo;

public class OperacionesBasicas {
    private int num1;
    private int num2;

    public OperacionesBasicas() {
    }

    public OperacionesBasicas(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double sumar(double a, double b){
        
        if (a == 0 || b == 0) {
            
            return 0;
        }else{
            return a+b;
        }
        
    }
    
    public double restar(double a, double b){
        
        if(a< b){
            return 0;
        }else{
            return a - b;
        }

    }
    
    public double multiplicar(double a, double b){
        
        if (b == 0) {
            return 1;
        }else{
            
        return a*b;
        }
    }
    
    
    public double dividir(double a, double b){
             
        if (b == 0) {
            return 0;
        }else{
            
        return a/b;
        }
    }

    
}
