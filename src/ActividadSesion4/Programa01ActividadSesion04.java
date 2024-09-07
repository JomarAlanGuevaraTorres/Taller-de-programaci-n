/*
1.- Crear un programa que permita ingresar un número (1-5) entero. Visualizar el
número ingresado en palabra.
Número=2
Palabra=”dos”
*/
package ActividadSesion4;

import java.util.Scanner;

public class Programa01ActividadSesion04 {

public static void main(String[] args){
//Definir las variable
int n;
String mensaje;
Scanner lectura=new Scanner(System.in);
//ingreso de datos
System.out.println("INGRESE UN NUMERO ENTERO ENTRE 1-5:");
n=lectura.nextInt();
//Proceso de datos
switch (n) {
case 1:mensaje="Uno" ;
break;
case 2:mensaje="Dos" ;
break;
case 3:mensaje="Tres" ;
break;
case 4:mensaje="Cuatro" ;
break;
case 5:mensaje="Cinco" ;
break;
default:mensaje="Número inválido";
}
//Salida de datos
System.out.println("El número ingresado es : "+mensaje);

}
}
