/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
*/
package guia03_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra06_PromedioEstaturas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int personas, suma1, sumaGeneral;
        double estatura, cont1, contGeneral, promedio1, promedioGeneral;
        suma1 = 0;
        sumaGeneral = 0;
        cont1 = 0;
        contGeneral = 0;
        
        System.out.println("Ingrese la cantidad de personas: ");
        personas = leer.nextInt();
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la estatura de la persona n°: " + (i + 1));
            estatura = leer.nextDouble();
            if (estatura <= 160) {
                suma1 += estatura;
                cont1 += 1;
            }
            sumaGeneral += estatura;
            contGeneral += 1;
        }
        promedio1 = suma1 / cont1;
        promedioGeneral = sumaGeneral / contGeneral;
        System.out.println("Promedio de estaturas que se encuentran por debajo de 1.60: " +  promedio1);
        System.out.println("Promedio de estaturas en general: " +  promedioGeneral);
    }
}
