package Tareas;

/*
Programa que de acuerdo a una nota imprime un mensaje
 */

import java.util.Scanner;

public class Programa07TareaSesion03CondicionMultiple {
  
    public static void main(String[] args) {
      //Definimos las variables 
      int nota;
      String mensaje = null;
      
      //solicitamos datos
      Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese la nota:");
        nota=lectura.nextInt();
        
      //procesamos datos
      if(nota<=5){
      mensaje= " Necesitas mejorar significativamente. "
               + "¡No te desanimes, sigue practicando y estudiando!";
      }
      if(5<nota&nota<=11){
      mensaje= " Estás cerca, pero aún no has alcanzado la calificación mínima. "
              + "Con un poco más de esfuerzo, podrás aprobar.";    
      }
      if(11<nota&nota<=14)  {
      mensaje= " ¡Has aprobado! Sin embargo, hay margen para mejorar. "
              + "Sigue esforzándote para alcanzar mejores resultados.";
      }
      if(14<nota&nota<=17){
      mensaje= " ¡Buen trabajo! Has superado la calificación mínima con creces. "
              + "Mantén este nivel de dedicación." ;
      }
     if(17<nota&nota<=20){
      mensaje= " ¡Excelente! Has alcanzado una calificación sobresaliente. "
               + "Sigue así, tus esfuerzos están dando frutos.";
     }
     
      //salida de datos
        System.out.println("Debido a que su nota es: "+nota+mensaje);
              
                
    }
}
