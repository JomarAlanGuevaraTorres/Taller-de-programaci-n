
package ActividadSesion1;

import java.util.Scanner;
// Clase Principal
public class Programa01ActividadSesion1 {
    // Metodo principal
    public static void main(String[] args) {
        // Declaracion de variables
        String nombreCliente, producto;
        double precio, cantidad, igv, totalPagar, subtotal;
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner lectura = new Scanner(System.in);
        
        // Solicitar el nombre del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        nombreCliente = lectura.next();
        
        // Solicitar el nombre del producto
        System.out.print("Ingrese el producto: ");
        producto = lectura.next();
        
        // Solicitar el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        precio = lectura.nextDouble();
        
        // Solicitar la cantidad del producto
        System.out.print("Ingrese la cantidad: ");
        cantidad = lectura.nextDouble();
        
        // Proceso de datos
        // Calcular el subtotal
        subtotal = precio * cantidad;
        
        // Calcular el IGV (18%)
        igv = subtotal * 0.18;
        
        // Calcular el total a pagar
        totalPagar = subtotal - igv;
        
        // Mostrar los resultados
        System.out.println("\nFactura:");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Producto: " + producto);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IGV (18%): " + igv);
        System.out.println("Total a Pagar: " + totalPagar);
    }
}

