package ActividadSesion1;

import java.util.Scanner;
public class Programa03ActividadSesion1 {
    public static void main(String[] args) {
        // Declaración de variables
        String empleado;
        double ingreso, gasto, ahorrom, ahorrob, ahorros, ahorroa;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner lectura = new Scanner(System.in);

        // Solicitar datos
        System.out.print("Ingrese nombre del empleado: ");
        empleado = lectura.next();

        System.out.print("Ingrese sueldo del empleado: ");
        ingreso = lectura.nextDouble();

        System.out.print("Ingrese gastos del empleado: ");
        gasto = lectura.nextDouble();

        // Proceso de datos
        ahorrom = ingreso - gasto;   
        ahorrob = ahorrom * 2;       
        ahorros = ahorrom * 6;       
        ahorroa = ahorrom * 12;      

        // Mostrar los resultados
        System.out.println("Resultados");
        System.out.println("Ahorro Mensual: " + ahorrom);
        System.out.println("Ahorro Bimestral: " + ahorrob);
        System.out.println("Ahorro Semestral: " + ahorros);
        System.out.println("Ahorro Anual: " + ahorroa);
    }
}
