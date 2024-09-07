/*
2.- Crear un programa que permita ingresar un número (1-10) entero. Visualizar el
número en romanos.
Número=5
Romano=V
 */
package ActividadSesion4;

import java.util.Scanner;

public class Programa02ActividadSesion04 {

public static void main(String[] args){
//Definir las variable
int n;
String mensaje;
Scanner lectura=new Scanner(System.in);
//ingreso de datos
System.out.println("INGRESE UN NUMERO ENTERO ENTRE 1-10:");
n=lectura.nextInt();
//Proceso de datos
switch (n) {
case 1:mensaje="I" ;
break;
case 2:mensaje="II" ;
break;
case 3:mensaje="III" ;
break;
case 4:mensaje="IV" ;
break;
case 5:mensaje="V" ;
break;
case 6:mensaje="VI" ;
break;
case 7:mensaje="VII" ;
break;
case 8:mensaje="VIII" ;
break;
case 9:mensaje="IX" ;
break;
case 10:mensaje="X" ;
break;
default:mensaje="Número inválido";
}
//Salida de datos
System.out.println("El número expresado en romano es : "+mensaje);

}
}