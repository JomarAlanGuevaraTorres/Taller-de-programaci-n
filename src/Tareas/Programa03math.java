package Tareas;
//Importamos librerias a utilizar
import java.lang.Math;
import java.util.Scanner;
//definimos la clase condicional numero positivo y negativo
public class Programa03math {
    public static void main(String[]args){
   //objeto de lectura
   Scanner lectura=new Scanner(System.in);
        int num,result;
        System.out.println("Ingrese el numero: ");
        num=lectura.nextInt();
        
       // procesar datos 
       
        result=(int) Math.signum(num);
   
        
          System.out.println("Devuelve 1 si x > 0,0 si x = 0 y -1 si x < 0: ");
           System.out.println(+result);
        
    }

}

