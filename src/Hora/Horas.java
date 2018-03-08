/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hora;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Horas {
       public static void main (String[] arg){
         Scanner scan = new Scanner(System.in);
         int dias;
          int horas, minutos, segundos;
          int op1 = 0,op2=0,op3=0;
          int contador=0;
         System.out.println("Cuantos dias trabajaste prro:");
         dias= scan.nextInt();
         
         while(contador<dias){
             System.out.println("Horas de trabajadas");
         horas = scan.nextInt();
          System.out.println("Minutos de trabajados");
          minutos = scan.nextInt();
           System.out.println("Segundos de trabajados");
           segundos = scan.nextInt();
           op1+=segundos;
           if(op1>=60){
               op1-=60;
               op2+=1;
              
           }
           op2+=minutos;
           if(op2>=60){
               op2-=60;
               op3+=1;
               
           }
         
           op3+=horas;
            contador++;
         }
           
             System.out.println("Tiempo trabajado");
             System.out.println(op3+"h\t"+op2+"m\t"+op1+"s");
         }
}

