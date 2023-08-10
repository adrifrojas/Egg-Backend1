/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
*/
package guia03_estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limitePositivo, num, suma;
        System.out.println("Ingrese un numero limite positivo: ");
        limitePositivo = leer.nextInt();
        suma = 0;
        do {
            System.out.println("Ingrese un número: ");
            num = leer.nextInt();
            suma += num;
        } while (suma < limitePositivo);
    }
}
