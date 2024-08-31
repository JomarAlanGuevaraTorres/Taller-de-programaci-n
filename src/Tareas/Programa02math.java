package Tareas;

import java.lang.Math;
import java.util.Scanner;
//calculo de la hipotenusa
public class Programa02math{
    public static void main(String[]args){
      
        double catO,catA,H;
        Scanner lectura=new Scanner(System.in);
    
        System.out.println("Ingrese el cateto opuesto: ");
        catO=lectura.nextDouble();
        System.out.println("Ingrese el cateto adyacente: ");
        catA=lectura.nextDouble();
        
       // procesar datos 
       
        H=(double) Math.hypot(catO,catA);
        
          System.out.println("La hipotenusa es : "+H);
        
    }

}