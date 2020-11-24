/*
 * Determine si un número es par o impar; de un rango de números del 1 al 10 
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        while (contador <=10) {
            if ((contador % 2) == 0) {
                System.out.printf("El número %d es par\n", contador);
            } else {
                System.out.printf("El número %d es impar\n", contador);
            }
            contador = contador + 1;
        }

    }

}
