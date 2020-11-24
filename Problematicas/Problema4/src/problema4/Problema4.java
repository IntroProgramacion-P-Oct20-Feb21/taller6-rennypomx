/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HOLA
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int contador = 1;
        String nombre;
        String cadenaFinal = "";
        int puntosAnotados;
        int cantidadFaltas;
        
        while (contador <= 10) {
            System.out.println("Ingresar el nombre del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese los puntos anotados de la temporada");
            puntosAnotados = entrada.nextInt();
            System.out.println("Ingrese la cantidad de faltas de la temporada");
            cantidadFaltas = entrada.nextInt();
            entrada.nextLine();
            cadenaFinal = String.format("%s%s\t%d\t%d\n",
                    cadenaFinal,
                    nombre,
                    puntosAnotados,
                    cantidadFaltas);
            contador = contador +1;
        }
        
        System.out.printf("%s\n", cadenaFinal);
        
    }
    
}
