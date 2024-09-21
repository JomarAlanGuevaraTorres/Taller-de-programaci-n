/*
Programa que suma los numeros hasta el ingresado 
 */
package ActividadSesion6;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        //declaramos variables
        int numero,sumatoria=0;
        Scanner lectura=new Scanner(System.in);
        //solicitamos datos
        System.out.println("Ingrese un Número");
        numero=lectura.nextInt();
        //procesamos datos
        int i = 1;
        while(i<=numero){
            sumatoria=sumatoria+i;
            i++;
        }
        //salida de datos
        System.out.println("La sumatoria de números hasta "  
                        +numero+" es igual a: "+ sumatoria);
        
        
    }
    
    
}
