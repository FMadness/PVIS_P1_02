/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pentagono;

import Pentagono.Punto;
import Pentagono.Linea;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class princi {
     public static void main (String[] arg){
         Scanner scan = new Scanner(System.in);
         System.out.println("Dame x1 :");
         Integer xx1 = scan.nextInt();
         System.out.println("Dame x2");
         Integer xx2= scan.nextInt();
         System.out.println("Dame y1 :");
         Integer yy1 = scan.nextInt();
         System.out.println("Dame y2");
         Integer yy2= scan.nextInt();
         
        Punto p1 = new Punto(xx1,yy1);
        Punto p2 = new Punto(xx2,yy2);
        Linea linea = new Linea (p1,p2);
        
         System.out.println(linea.distancia());
         
     }
}
