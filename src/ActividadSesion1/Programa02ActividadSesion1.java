
package ActividadSesion1;

import java.util.Scanner;
// Clase Principal
public class Programa02ActividadSesion1 {
    // Metodo principal
    public static void main(String[] args) {
        // Declaración de variables
        double s1, s2, s3, s4, s5, total, promedio;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner lectura = new Scanner(System.in);

        // Solicitar sueldos
        System.out.print("Ingrese sueldo 1: ");
        s1 = lectura.nextDouble();

        System.out.print("Ingrese sueldo 2: ");
        s2 = lectura.nextDouble();

        System.out.print("Ingrese sueldo 3: ");
        s3 = lectura.nextDouble();

        System.out.print("Ingrese sueldo 4: ");
        s4 = lectura.nextDouble();

        System.out.print("Ingrese sueldo 5: ");
        s5 = lectura.nextDouble();

        // Proceso de datos
        // Calcular el total de sueldos
        total = s1 + s2 + s3 + s4 + s5;

        // Calcular el promedio
        promedio = total / 5;

        // Mostrar los resultados
        System.out.println("Resultados");
        System.out.println("Total de sueldos: " + total);
        System.out.println("Promedio: " + promedio);
    }
}
 
