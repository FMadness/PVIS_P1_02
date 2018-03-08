/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Reloj {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
       
        
        System.out.println("Dime el segundo: ");
        Integer ss = teclado.nextInt();
        System.out.println("Dime el minuto: ");
        Integer mm = teclado.nextInt();
        System.out.println("Dime la hora: ");
        Integer hor = teclado.nextInt();
        Hora horr = new Hora(ss, mm, hor);
        System.out.println("Dime el dia: ");
        Integer dd = teclado.nextInt();
        System.out.println("Dime el mes: ");
        Integer sem = teclado.nextInt();
        System.out.println("Dime el año: ");
        Integer aa = teclado.nextInt();
        Fecha fech = new Fecha(dd, sem, aa);
        Resultado res = new Resultado(horr, fech);
        while(true){    
            res.aumentar();
            System.out.println(res);
        }
    }
}
