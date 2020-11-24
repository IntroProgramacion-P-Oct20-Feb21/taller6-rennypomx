/*
    Generar un programa que permita generar la tabla de sumar o multiplicar. 
    - El usuario debe ingresar si desea la tabla de sumar o restar.
    - El usuario debe ingresar el número de tabla a generar
    - El usuario debe ingresar el límite de la tabla
*/
package ejemplos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String tipoOperacion;
        String cadenaFinal = "";
        int numeroTabla;
        int limiteTabla;
        int operacion;
        int contador = 1;
        
        System.out.println("indique que tipo de tabla quiere realizar\n"
                + "suma\n"
                + "o\n"
                + "multiplicación: \n");
        tipoOperacion = entrada.nextLine();
        System.out.println("Ingrese el número de tabla:\n");
        numeroTabla = entrada.nextInt();
        System.out.println("Ingrese el limite de tabla:\n");
        limiteTabla = entrada.nextInt();
                
        switch(tipoOperacion){
            case "suma":
                cadenaFinal = String.format("%s%s\n", cadenaFinal, 
                        "Tabla de sumar");
                while(contador <= limiteTabla){
                    operacion = numeroTabla + contador;
                    cadenaFinal = String.format("%s%d + %d = %d\n", cadenaFinal, 
                        numeroTabla, contador, operacion);
                    contador = contador + 1;
                }
                break;
            
            case "multiplicación":
                cadenaFinal = String.format("%s%s\n", cadenaFinal, 
                        "Tabla de multiplicar");
                while(contador <= limiteTabla){
                    operacion = numeroTabla * contador;
                    cadenaFinal = String.format("%s%d * %d = %d\n", cadenaFinal, 
                        numeroTabla, contador, operacion);
                    contador = contador + 1;
                }
                break;
            
            default:
                cadenaFinal = String.format("%s%s\n", cadenaFinal, 
                        "Error en tipo de operación");
        }
        
        System.out.printf("%s\n", cadenaFinal);
    }
}
