/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polinomio;

import Polinomio.Monomio;
import Polinomio.Polinomio;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class MainPoli {
    public static void main (String[]args){
        Scanner scan= new Scanner(System.in);
         Polinomio p = new Polinomio();
         
        int tamaño;
        int coe;
        System.out.println("Introduzca el tamaño del polinomio");
        tamaño = scan.nextInt();
        for(int i=0;i<tamaño;i++){
        System.out.println("coeficiente");
       
       
        Monomio mm= new Monomio(3,2);
        p.agregar(mm);
       
    }
    }
    
}
