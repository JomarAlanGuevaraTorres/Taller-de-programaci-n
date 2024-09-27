package ActividadSesion7;
/*
programa que permite registrar edades de una población 
y muestra la edad promedio, la edad más alta, la más baja y el 
porcentaje de personas mayores de 18 años.
 */
import java.util.Scanner;
public class Programa02ActividadSesion07 {
    public static void main(String[] args) {
        //declarar variables
        int cant,edad,mayor = 0,menor=200,cpm = 0,prom,suma = 0;
        double pormay;
        int i=1;
        Scanner lectura=new Scanner(System.in);
        //Solicitud y proceso de datos
        System.out.print("Ingrese la cantidad de personas a registrar: ");
            cant=lectura.nextInt();
        do {
            System.out.print("Ingrese la edad de la persona "+i+" :"); 
            edad=lectura.nextInt();
        
            if(edad>mayor){
                mayor=edad;
            }
            if(edad<menor){
               menor=edad; 
            }
            if(edad>=18){
                cpm++;
            }
            suma+=edad;
            prom=suma/cant;
            pormay=cpm*100/cant;
            i++;
        }while(i<=cant);
        //Salida de datos 
        System.out.println("La cantidad e poersonas encuestadas es: "+cant);
        System.out.println("El promedio de edades es: "+prom);
        System.out.println("La edad mayor es: "+mayor);
        System.out.println("La edad menor es: "+menor);
        System.out.println("La cantidad de personas mayores de edad es: "+cpm);
        System.out.println("El porcentaje de personas mayores es: "+pormay+"%");
      
        
    }
}
