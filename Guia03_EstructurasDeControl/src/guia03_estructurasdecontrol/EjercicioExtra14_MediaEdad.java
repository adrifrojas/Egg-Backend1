/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
*/
package guia03_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra14_MediaEdad {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N, M, cantHijos, edades, sumaEdad;
        double media;
        sumaEdad = 0;
        cantHijos = 0;
        
        System.out.println("Ingrese la cantidad de familias: ");
        N = leer.nextInt();
        
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia n°: " + (i + 1));
            M = leer.nextInt();
            cantHijos += M;
            for (int j = 0; j < M; j++) {
                System.out.println("Ingrese la edad del hijo n°: " + (j+1));
                edades = leer.nextInt();
                sumaEdad += edades;
            }
        }
        media = sumaEdad / cantHijos;
        System.out.println("La media de edades es de: " + media);
    }
}
