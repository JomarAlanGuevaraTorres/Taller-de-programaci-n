package ActividadSesion8;

/*
 Programa que permite ingresas n cantidad de notas, luego imprime la mayor 
y menor nota,imprime la suma y calcula el promedio
Ejemplo:
n=5
nota 1: 15
nota 2: 16
nota 3 :13
nota 4: 18
nota 5: 11

Salida :
La mayor nota es: 18.0
La suma de notas es: 73.0
El promedio de notas es: 14.6
 */
import java.util.Scanner;
public class Programa01ActividadSesion8 {
    public static void main(String[] args) {
        //declarar variables 
        int n;
        double nota,sn = 0.0,pn,mayorN = 0,menorN=Double.POSITIVE_INFINITY;
        Scanner lectura=new Scanner(System.in);
       //Solicitus de datos 
        System.out.println("Ingrese la cantidad de notas a registrar: ");
        n=lectura.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.print("Ingrese la nota "+i+" :");
            nota=lectura.nextDouble();
            if(nota>mayorN){
               mayorN=nota; 
            }
            if(nota<menorN){
            sn+=nota;
            }
        }
        pn=sn/n;
        System.out.println("La mayor nota es: "+mayorN);
        System.out.println("La suma de notas es: "+sn);
        System.out.println("El promedio de notas es: "+pn);
    }
}
