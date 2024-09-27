package ActividadSesion7;
/*
 Programa de registro de temperaturas diarias
 programa que solicita al usuario ingresar la temperatura diaria de n dias
y calcula estadísticas al final, como la temperatura promedio, 
la más alta y la más baja.
 */
import java.util.Scanner;
public class Programa03ActividadSesion07 {
    public static void main(String[] args) {
        //declarar varibles
        double temp,suma = 0,prom,mayor = 0,menor = Double.POSITIVE_INFINITY;
        int n,i = 1; 
        Scanner lectura=new Scanner(System.in);
        //solicitud y proceso de datos
            System.out.print("Ingrese la cantidad de días: ");
            n=lectura.nextInt();
            
            do{
                System.out.print("Ingrese la temperatura "+i+" : ");
                temp=lectura.nextInt();
                i++;
                suma+=temp;
                prom=suma/n;
                if(temp>mayor){
                    mayor=temp;
                }
                if(temp<menor){
                  menor=temp;
                } 
              
            }while(i<=n);
            //salida de datos
           System.out.println("El promedio es: "+prom);
           System.out.println("La mayor temperatura fue: "+mayor);
           System.out.println("La menor temperatura fue: "+menor);
            
    
    }
    
    
}
