
package ActividadSesion3;

import java.util.Scanner;

public class Programa02ActividadSesion03  {
    
    public static void main (String[]args){
       
        int practica,parcial,exfinal;
        double promedio;
        String mensaje;
        
    Scanner teclado=new Scanner(System.in);
    
        System.out.println("Ingrese la nota de la práctica:");
        practica=teclado.nextInt();
        System.out.println("Ingrese la nota del parcial:");
        parcial=teclado.nextInt();
        System.out.println("Ingrese la nota del final:");
        exfinal=teclado.nextInt();
        
     promedio=(practica*0.20)+(parcial*0.30)+(exfinal*0.50);
     
     if(promedio>=11.5){
     mensaje=promedio+" ,por lo tanto está APROBADO";
     }
     else{
         mensaje=promedio+", por lo tanto está DESAPROBADO";
     }
     
        System.out.println("Su promedio final es: "+mensaje);
    }
}
