/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, 
la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.*/
package guia03_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra08_Multiplo5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, cont, contPar, contImpar;
        cont = 0;
        contPar = 0;
        contImpar = 0;
        
        do {
            System.out.println("Ingrese un número: ");
            num = leer.nextInt();
            cont += 1;
            if (num % 2 == 0) {
                contPar ++;
            }else{
                contImpar ++;
            }
        } while (num %5 != 0);
        System.out.println("Total de números ingresados:  " + cont);
        System.out.println("Números pares: " + contPar);
        System.out.println("Números pares: " + contImpar);
    }
}
