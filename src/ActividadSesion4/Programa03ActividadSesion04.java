/*
 3.- Crear un programa que permita ingresar un número (1-6) entero. Visualizar el
número en inglés.
Número=1
Ingles=”one”
 */
package ActividadSesion4;

import java.util.Scanner;

public class Programa03ActividadSesion04 {
public static void main(String[] args){
//Definir las variable
int n;
String mensaje;
Scanner lectura=new Scanner(System.in);
//ingreso de datos
System.out.println("INGRESE UN NUMERO ENTERO ENTRE 1-6:");
n=lectura.nextInt();
//Proceso de datos
switch (n) {
case 1:mensaje="ONE" ;break;
case 2:mensaje="TWO" ;break;
case 3:mensaje="THREE" ;break;
case 4:mensaje="FOR" ;break;
case 5:mensaje="FIVE" ;break;
case 6:mensaje="SIX" ;break;

default:mensaje="Número inválido";
}
//Salida de datos
System.out.println("El número expresado en ingles es : "+mensaje);

}
}  

