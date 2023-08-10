/*
Crear un programa que dibuje una escalera de números, donde cada línea de 
números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. 
Ejemplo: si se ingresa el número 3:
1 
12
123
 */
package guia03_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra13_EscaleraNumeros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int altura;
        System.out.println("Ingrese la altura de la escalera: ");
        altura = leer.nextInt();
        for (int i = 0; i <= altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            System.out.println(" ");
        }
    }
}
