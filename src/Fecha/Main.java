/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fecha;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Main {
    public static void main (String[] args){
         
        
        Scanner teclado = new Scanner(System.in);
      
      
        System.out.println("Dia:");
        Integer dd=teclado.nextInt();
        System.out.println("Mes:");
        Integer mm=teclado.nextInt();
        System.out.println("Año:");
        Integer aa=teclado.nextInt();
         System.out.println("Dias aumentar");
         Integer daa=teclado.nextInt();
      
         
         Fecha f = new Fecha(dd,mm,aa,daa);
          f.setDia(dd);
          f.setMes(mm);
          f.setAnio(aa);
          f.Aumentar(daa);
        System.out.println(f);
    }
}


