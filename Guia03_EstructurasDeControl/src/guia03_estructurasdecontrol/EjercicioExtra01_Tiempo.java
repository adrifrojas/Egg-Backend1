/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package guia03_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra01_Tiempo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double minutos, dias, horas, restoHoras;
        System.out.println("Ingrese los minutos: ");
        minutos = leer.nextInt();
        horas = minutos / 60;
        dias = Math.round(horas/24);
        restoHoras = Math.round(horas % 24);
        
        if (dias == 1) {
            System.out.println("Es: 1 dia y " + restoHoras + " horas");
            
        }else{
            if (dias > 1 ) {
                 System.out.println("Son " + dias + " dias y " + restoHoras + " horas");
            }else{
                if (dias < 1) {
                    System.out.println("Son: " + horas + " horas");
                }
            }
        }
    }
}
