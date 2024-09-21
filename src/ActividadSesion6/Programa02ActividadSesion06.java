/**
 Programa para sumar los dígitos de un número 
 */
package ActividadSesion6;

import java.util.Scanner;

public class Programa02ActividadSesion06 {
    public static void main(String[] args) {
        //declarar variables
        int numero, dig, suma = 0;
        Scanner lectura = new Scanner(System.in);
        
        //ingreso de datos
        System.out.println("Introduce un número: ");
        numero = lectura.nextInt();

        // Procesamos los datos
        while (numero > 0) {
            dig = numero % 10;  
            suma += dig;        
            numero=numero/10;       
        }

        System.out.println("La suma de los dígitos es: " + suma);
    }
}
