/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
*/
package guia02_introjava;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre: ");
        nombre = leer.next();
        System.out.println("Su nombre es: " + nombre);
    }
    
}
