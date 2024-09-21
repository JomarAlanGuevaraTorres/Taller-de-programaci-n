package ActividadSesion2;
//Importamos librerias a utilizar
import java.util.Scanner;
import java.lang.Math;
//definimos la clase potencia x de un numero 
public class Programa01ActividadSesion2 {
//Definimos el metodo
    public static void main(String[]args){
    //Creamos un objeto de lectura
    Scanner lectura=new Scanner(System.in);
    //definimos tipos de datos 
    int base,exp,potencia;
    //solicitamos Datos 
    System.out.println("Ingrese la base : ");
    base=lectura.nextInt();
    System.out.println("Ingresa el exponente: ");
    exp=lectura.nextInt();
    //procesamos datos 
    potencia=(int) Math.pow(base, exp);
    //mostramos resultados
    System.out.println("El resultado es : "+potencia);
    //Fin del metodo
 //Fin del algoritmo
  
    }
}
        