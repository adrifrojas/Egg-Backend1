/*
Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
*/
package guia03_estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio03_FuncionLenght {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra: ");
        palabra = leer.next();
        if (palabra.length() == 8) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
}
