/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia03_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra02_CambioValores {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A, B, C, D, aux;
        System.out.println("Ingrese el valor de A: ");
        A = leer.nextInt();
        System.out.println("Ingrese el valor de B: ");
        B = leer.nextInt();
        System.out.println("Ingrese el valor de C: ");
        C = leer.nextInt();
        System.out.println("Ingrese el valor de D: ");
        D = leer.nextInt();
        
        System.out.println("A:"+ A + " B:"+B + " C:"+C +" D:"+D);
        aux=A; B=C; C=D; D=aux; aux=A; A=C; A=aux;
        System.out.println("A:"+ A + " B:"+B + " C:"+C +" D:"+D);
    }
}
