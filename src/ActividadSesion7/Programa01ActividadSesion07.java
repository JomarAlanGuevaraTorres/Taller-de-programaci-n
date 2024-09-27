package ActividadSesion7;
/*
 Registro de compras y cálculo de estadísticas
Descripción: Un programa que registra las compras que realiza un cliente en una 
tienda (cantidad de productos y precio unitario), y luego muestra el total gastado, 
el producto más caro y el más barato.
 */
import java.util.Scanner;
public class Programa01ActividadSesion07 {
    public static void main(String[] args) {
        //declaramos variables
        String nombre,opcion,mascar = null,masbar=null;
        int cant, preciouni, precioparcial, gastototal = 0;
        double mascaro = 0, masbarato=Double.POSITIVE_INFINITY;
        Scanner lectura=new Scanner(System.in);
        //Solicitud y proceso de datos
        do{
            System.out.print("Nombre del producto a registrar: ");
            nombre=lectura.next();
            System.out.print("Ingrese la cantidad de productos comprados: ");
            cant=lectura.nextInt();
            System.out.print("Ingrese el precio del producto: ");
            preciouni=lectura.nextInt();
            precioparcial=cant*preciouni;
          
            if(preciouni>mascaro){
                mascaro=preciouni;
                mascar=nombre;
            }
            if(preciouni<masbarato){
                masbarato=preciouni;
                masbar=nombre;
            }
            do{
                System.out.print("¿Desea continuar registrand? si/no: ");
            opcion=lectura.next();
                if(!opcion.equalsIgnoreCase("si")
                   &&!opcion.equalsIgnoreCase("no")){
                    System.out.println("Escriba si o no");
                }
            }while(!opcion.equalsIgnoreCase("si")
                   &&!opcion.equalsIgnoreCase("no"));
            
            gastototal+=precioparcial;
            precioparcial=0;
        }while(opcion.equalsIgnoreCase("si"));
        
        //Salida de datos 
                System.out.println("el total a pagar es: "+gastototal);
                System.out.println("El producto mas caro es: "+mascar);
                System.out.println("Con un valor de: "+mascaro);
                System.out.println("El producto mas barato es: "+masbar);
                System.out.println("Con un valor de: "+masbarato);
            }
    
}
