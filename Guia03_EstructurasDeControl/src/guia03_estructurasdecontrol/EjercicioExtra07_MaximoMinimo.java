/*
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package guia03_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra07_MaximoMinimo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, numMax, numMin, suma, cont;
        double promedio;
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        numMax = num;
        numMin = num;
        suma = 0;
        cont = 0;
        
    while (num>0){
        numMax = Math.max(numMax, num);
        numMin = Math.min(numMin, num);
        suma += num;
        cont += 1;
        
        System.out.println("Ingrese un número:");
        num = leer.nextInt();
    }
    
    promedio = suma / cont;
        System.out.println("Número máximo: " + numMax);
        System.out.println("Número Mínimo: " + numMin);
        System.out.println("Promedio: " + promedio);
        
        
    numMax = num;
    numMin = num;
    suma = 0;
    cont = 0;
     do {
        numMax = Math.max(numMax, num);
        numMin = Math.min(numMin, num);
        suma += num;
        cont += 1;
        
        System.out.println("Ingrese un número:");
        num = leer.nextInt();
    } while (num > 0);
        System.out.println("Número máximo: " + numMax);
        System.out.println("Número Mínimo: " + numMin);
        System.out.println("Promedio: " + promedio);
    }
}
