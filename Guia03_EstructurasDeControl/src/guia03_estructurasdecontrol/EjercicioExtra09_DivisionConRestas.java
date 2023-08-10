/*
Simular la división usando solamente restas. Dados dos números enteros mayores 
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo 
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas 
es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
*/
package guia03_estructurasdecontrol;

import java.util.Scanner;

public class EjercicioExtra09_DivisionConRestas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, aux;
        aux = 0;
        do {
            System.out.println("Ingrese dos numeros:");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            
        } while (num1>1 || num2>1);
        
        while (num1>num2) {
            num1 -= num2;
            aux ++;
        }
        System.out.println("El residuo es: " + num1 + " y el cociente es: " + aux);
    }
}
