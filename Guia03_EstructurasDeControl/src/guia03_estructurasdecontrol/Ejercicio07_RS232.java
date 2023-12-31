/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().   
*/
package guia03_estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio07_RS232 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String FDE;
        int sumaCorrectas, sumaIncorrectas;
        sumaCorrectas = 0;
        sumaIncorrectas = 0;
        do {
            do {
                System.out.println("Ingrese la cadena: ");
                FDE = leer.next();
            } while (FDE.length() != 5);
            if (FDE.substring(0,1).equalsIgnoreCase("x") || FDE.substring(4,5).equalsIgnoreCase("o") ){
                sumaCorrectas += 1;
            }else{
                sumaIncorrectas +=1;
            }
        } while (!FDE.equalsIgnoreCase("&&&&&") );
        System.out.println("Total Correctas: " + sumaCorrectas);
        System.out.println("Total Incorrectas : " + sumaIncorrectas);
    }
}
