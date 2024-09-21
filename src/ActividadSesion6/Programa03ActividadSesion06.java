/*
 PROGRAMA QUE PERMITE INGRESAR UN NUMERO E IMPRIME 
LOS NUMERO EN ORDEN HASTA ESE NUMERO INGRESADO
DATOS: 10
RESULTADO:1,2,3,4,5,6,7,8,9,10
 */
package ActividadSesion6;
import java.util.Scanner;

public class Programa03ActividadSesion06 {
    public static void main(String[] args) {
        // Declaramos variables
        int numero, temp = 1;  
        String mensaje = "";

        Scanner lectura = new Scanner(System.in);
        // Ingresamos datos
        System.out.println("Ingrese un número:");
        numero = lectura.nextInt();

        // Proceso: acumulamos los números en la variable 'mensaje'
        while(temp <= numero){ 
            mensaje += temp + ","; 
            temp++; 
        }

        // Eliminar la última coma
        if (mensaje.length() > 0) {
            mensaje = mensaje.substring(0, mensaje.length() - 1);
        }

        // Salida: mostramos el resultado
        System.out.println(mensaje);

        // Cerramos el scanner
        lectura.close();
    }
}
