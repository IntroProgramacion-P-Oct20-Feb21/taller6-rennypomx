/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HOLA
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int numero_Mensualidades;
        int opcion;
        double base_Netflix = 10;
        double base_Disney = 6;
        double base_Apple = 5;
        double base_Amazon = 4.50;
        String cadenaFinal = "";

        System.out.println("Ingresar el nombre del cliente:");
        nombre = entrada.nextLine();
        System.out.println("Ingresar el número de mensualidades a pagar "
                + "(minimo 2):");
        numero_Mensualidades = entrada.nextInt();
        
        if (numero_Mensualidades >= 2) {
            System.out.println("Ingresar la opción segun la empresa de "
                    + "Streaming"
                    + "que desea cancelar el servicio.\n"
                    + "Ingresar 1 para escoger Netflix\n"
                    + "Ingresar 2 para escoger Disney Plus\n"
                    + "Ingresar 3 para escoger Apple TV\n"
                    + "Ingresar 4 para escoger Amazon Prime");
            opcion = entrada.nextInt();

            double total_mes_Netflix = numero_Mensualidades * base_Netflix;
            double total_mes_Disney = numero_Mensualidades * base_Disney;
            double total_mes_Apple = numero_Mensualidades * base_Apple;
            double total_mes_Amazon = numero_Mensualidades * base_Amazon;
            double iva_Netflix = total_mes_Netflix * 0.1; //10%
            double iva_Disney = total_mes_Disney * 0.12;  //12%
            double iva_Apple = total_mes_Apple * 0.14;  //14%
            double iva_Amazon = total_mes_Amazon * 0.16;  //16%
            double total_Netflix = total_mes_Netflix + iva_Netflix;
            double total_Disney = total_mes_Disney + iva_Disney;
            double total_Apple = total_mes_Apple + iva_Apple;
            double total_Amazon = total_mes_Amazon + iva_Amazon;
        

            switch (opcion) {
                case 1:
                    cadenaFinal = String.format("Usuario: %s\n"
                            + "Empresa: Netflix\n"
                            + "Número de mensualidades a pagar: %d\n"
                            + "Precio Base (mensual): $%.2f\n"
                            + "Total de %d mensualidad/es: $%.2f\n"
                            + "Impuesto: $%.2f\n"
                            + "Total a cancelar: $%.2f\n",
                            nombre,
                            numero_Mensualidades,
                            base_Netflix,
                            numero_Mensualidades,
                            total_mes_Netflix,
                            iva_Netflix,
                            total_Netflix);
                    break;
                case 2:
                    cadenaFinal = String.format("Usuario: %s\n"
                            + "Empresa: Disney Plus\n"
                            + "Número de mensualidades a pagar: %d\n"
                            + "Precio Base (mensual): $%.2f\n"
                            + "Total de %d mensualidad/es: $%.2f\n"
                            + "Impuesto: $%.2f\n"
                            + "Total a cancelar: $%.2f\n",
                            nombre,
                            numero_Mensualidades,
                            base_Disney,
                            numero_Mensualidades,
                            total_mes_Disney,
                            iva_Disney,
                            total_Disney);
                    break;
                case 3:
                    cadenaFinal = String.format("Usuario: %s\n"
                            + "Empresa: Apple TV\n"
                            + "Número de mensualidades a pagar: %d\n"
                            + "Precio Base (mensual): $%.2f\n"
                            + "Total de %d mensualidad/es: $%.2f\n"
                            + "Impuesto: $%.2f\n"
                            + "Total a cancelar: $%.2f\n",
                            nombre,
                            numero_Mensualidades,
                            base_Apple,
                            numero_Mensualidades,
                            total_mes_Apple,
                            iva_Apple,
                            total_Apple);
                    break;
                case 4:
                    cadenaFinal = String.format("Usuario: %s\n"
                            + "Empresa: Amazon Prime\n"
                            + "Número de mensualidades a pagar: %d\n"
                            + "Precio Base (mensual): $%.2f\n"
                            + "Total de %d mensualidad/es: $%.2f\n"
                            + "Impuesto: $%.2f\n"
                            + "Total a cancelar: $%.2f\n",
                            nombre,
                            numero_Mensualidades,
                            base_Amazon,
                            numero_Mensualidades,
                            total_mes_Amazon,
                            iva_Amazon,
                            total_Amazon);
                    break;
                default:
                    cadenaFinal = String.format("%sDatos erroneos\n",
                            cadenaFinal);
                    break;
            }
            
        } else {
            cadenaFinal = String.format("%sDatos erroneos\n", cadenaFinal);
        }

        System.out.printf("%s\n", cadenaFinal);

    }
    
}
