/*
Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package guia03_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra10_AdivinarMultiplicacion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, mult, resp;
        num1 = (int) (Math.random()* 10);
        num2 = (int) (Math.random()* 10);
        // System.out.println(num1);
        // System.out.println(num2);
        mult = num1 * num2;
        do {
            System.out.println("Adivine el numero: ");
            resp = leer.nextInt();
            if (mult == resp) {
                System.out.println("CORRECTO!!!");
            }else{
                System.out.println("INCORRECTO!!!");
            }
        } while (mult != resp);
    }
}
