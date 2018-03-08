/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polinomio;

import java.util.ArrayList;

/**
 *
 * @author josem
 */
public class Polinomio {
    private ArrayList<Monomio> elementos;
    public Polinomio(){
        elementos=new ArrayList<Monomio>();
    }
        public void agregar(Monomio m){
        this.elementos.add(m);
        }
          public void Simplificar(){
              ArrayList<Monomio> temporal = new ArrayList<Monomio>();
   while(this.elementos.size()!=0){
       Monomio actual = this.elementos.remove(0);
       int i =0;
       while(i<this.elementos.size()){
           Monomio comparar= this.elementos.get(i);
           if(actual.getexponente().compareTo(comparar.getexponente())==0){
           actual.setcoeficiente(actual.getcoeficiente()+comparar.getcoeficiente());
           this.elementos.remove(i);
           }else{
               i++;
           }
           
       }
       elementos=temporal;
               
               
   }
   
    }
          
          public Integer tamanio(){
              return this.elementos.size();
          }
          public Monomio obtener(Integer i){
              return this.elementos.get(i);
          }
          public void Agregar(Monomio m){
              this.elementos.add(m);
              this.Simplificar();
          }
          public void Agregar(Polinomio p){
              for(int i=0;i<p.tamanio();i++){
                  Monomio aux =p.obtener(i);
              this.elementos.add(new Monomio(aux.getcoeficiente(),aux.getexponente()));
                
              }
              this.Simplificar();
              
          }
          
        public String toString(){
            String acumulador=" ";
            for(int i=0; i<this.elementos.size();i++){
                    Monomio m =this.elementos.get(i);
                    acumulador=acumulador+m.toString();
            }
         return acumulador;
        }
      
    
    
}

