/*
 * Determine si un número es par o impar
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 11;
        
        if( (numero%2)==0){
            System.out.printf("El número %d es par\n", numero);
        }else{
            System.out.printf("El número %d es impar\n", numero);
        }
        
    }
    
}
