/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
*/
package guia02_introjava;

import java.util.Scanner;


public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase: ");
        frase = leer.next();
        System.out.println("La frase es: ");
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
