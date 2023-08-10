/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
package guia03_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra03_Vocal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String vocal;
        System.out.println("Ingrese una vocal: ");
        vocal = leer.next();
        if (vocal.equalsIgnoreCase("a") || vocal.equalsIgnoreCase("e") ||  
            vocal.equalsIgnoreCase("i") ||  vocal.equalsIgnoreCase("o") ||  
            vocal.equalsIgnoreCase("u")) {
            System.out.println("VOCAL");  
        }else{
            System.out.println("CONSONANTE");
        }
    }
}
