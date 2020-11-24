/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HOLA
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int contador = 1;
        String nombre;
        String cadenaFinal = "";
        double promedioCiclo;
        String estadoReporte = "";
        
        while (contador <= 4) {            
            System.out.println("Ingrese el nombre del estudiante");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el promedio del ciclo");
            promedioCiclo = entrada.nextDouble();
            entrada.nextLine();
            if ((promedioCiclo >= 0) && (promedioCiclo<7)) {
                estadoReporte = "Reprobado";
            }
            if ((promedioCiclo >= 7) && (promedioCiclo <= 10)) {
                estadoReporte = "Aprobado";
            }
            cadenaFinal = String.format("%s%s\t%.2f\t%s\n",
                    cadenaFinal,
                    nombre,
                    promedioCiclo,
                    estadoReporte);
            contador = contador + 1;
        }
        
        System.out.printf("%s\n", cadenaFinal);  
    }  
}
