/*
4.- Crear un programa que permita ingresar un número (1,2,3,4,6,12) entero. Visualizar
el nombre del periodo anual, por ejemplo:
Número=2
 */
package ActividadSesion4;

import java.util.Scanner;


public class Programa04ActividadSesion04 {
public static void main(String[] args){
//Definir las variable
int n;
String mensaje;
Scanner lectura=new Scanner(System.in);
//ingreso de datos
System.out.println("INGRESE UN NUMERO ENTERO PARA DETERMINAR EL PERIODO ANUAL:");
n=lectura.nextInt();
//Proceso de datos
switch (n) {
case 1:mensaje="ANUAL" ;break;
case 2:mensaje="SEMESTRAL" ;break;
case 3:mensaje="CUATRIMESTRAL" ;break;
case 4:mensaje="TRIMESTRAL" ;break;
case 6:mensaje="BIMESTRAL" ;break;
case 12:mensaje="MENSUAL" ;break;

default:mensaje="Número inválido";
}
//Salida de datos
System.out.println("EL NUMERO INGRESADO CORRESPONDE A : "+mensaje);

}
}     

