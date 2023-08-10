/*
Escribir un programa que lea un número entero y devuelva el número de dígitos 
que componen ese número. Por ejemplo, si introducimos el número 12345, 
el programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división. Nota: recordar que las variables de tipo 
entero truncan los números o resultados.
*/
package guia03_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra11_Digitos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, aux, cont;
        System.out.println("Ingrese un número: ");
        num = leer.nextInt();
        cont = 0;
        
        while (num > 0){
            num /= 10;
            cont ++;
        }
        System.out.println("EL número tiene " + cont + " digitos");
    }
}
