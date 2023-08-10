// Crear un programa que dado un número determine si es par o impar.

package guia03_estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio01_ParImpar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número: ");
        num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es PAR");
        }else{
            System.out.println("el numero " + num + " es IMPAR");
        }
    }
}
