/*
Program que permite el ingreso de edades con sus respectivos nombres, luego 
procesa datos, imprime los datos, la mayor y menor edad asi como su resta.
Datos de prueba:
Nombre y edad:
Jose 18
Pedro 15
Juan 5
Carlos 16
Ricardo 43

mayor edad = 43
menor edad =5
resta = 38 
*/
package ActividadSesion9;
import java.util.Scanner;

public class Programa01ActividadSesion9 {
    
    public static void main(String[] args) {
        //Declarar variables
        int n,edad,mayore = 0,menore = 200,resta;
        String nombre, nombremayor="", nombremenor="";
        Scanner lectura=new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de edades:");
        n=lectura.nextInt();
        int[] aedades=new int[n];
        String[] anombres=new String[n];
       
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre "+(i+1)+" : ");
            nombre=lectura.next();
            anombres[i]=nombre;
            System.out.print("Ingrese la edad "+(i+1)+" : ");
            edad=lectura.nextInt();
            aedades[i]=edad;
        }
        //proceso de datos 
        for (int i = 0; i < n; i++) {
            if(aedades[i]>mayore){
                mayore=aedades[i];
                nombremayor=anombres[i];
            }
            if(aedades[i]<menore){
                menore=aedades[i];
                nombremenor=anombres[i];
            }
        }
         resta=mayore-menore;   
        //Salida de datos   
        System.out.println("\nLista de nombres y edades:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nombre: " + anombres[i] + ", Edad: " + aedades[i]);
        }
        System.out.println("La mayor edad es: "+mayore+ " su nombre es: "+nombremayor);
        System.out.println("La menor edad es: "+menore+ " su nombre es: "+nombremenor);
        System.out.println("La resta de ambas es: "+resta);
        
    }  
}
