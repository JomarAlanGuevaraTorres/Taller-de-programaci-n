package ActividadSesion3;

import java.util.Scanner;

public class Programa01ActividadSesion03 {
   /*
    Programa que valida si una compra es mayor a 1000 
    y otorga un descuento de 10%
    */
    public static void main(String[] args) {
        //Definir variables
        int monto;
        double descuento; 
        String mensaje;
        
        //solicitamos datos
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese el monto total comprado:");
        monto=lectura.nextInt();
        
        //procesamos los datos
        mensaje="Tiene un descuento del 10%, total a pagar: ";
        descuento=monto*0.90;
        
        if(monto>=1000) {                
            System.out.println(mensaje+descuento);       
            } 
    }
}
