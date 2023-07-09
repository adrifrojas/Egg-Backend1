/*Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma*/
package guia02_introjava;

import java.util.Scanner;


public class Ejercicio01 {
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Inrese dos números: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("La suma de los dos numeros es: " + (num1 + num2));
    }
    
}
