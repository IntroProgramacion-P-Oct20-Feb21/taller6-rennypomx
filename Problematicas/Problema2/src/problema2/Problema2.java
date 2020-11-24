/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HOLA
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numerador = 1;
        int denominador_Par = 20;
        int denominador_Impar = 10;
        String cadenaFinal = "";
        
        while (numerador <= 6) {  
            if ((numerador % 2) == 0) {
                cadenaFinal = String.format("%s %d / %d\n",
                        cadenaFinal, numerador , denominador_Par);
                denominador_Par = denominador_Par + 1;
            } else {
                 cadenaFinal = String.format("%s %d / %d\n",
                        cadenaFinal, numerador , denominador_Impar);
                denominador_Impar = denominador_Impar + 1;                   
            }
            
            numerador = numerador + 1;
            
        }
        
        System.out.printf("%s\n", cadenaFinal);
        
    }
    
}
