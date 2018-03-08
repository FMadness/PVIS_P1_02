/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pentagono;

/**
 *
 * @author josem
 */
public class Punto {
    private Integer x;
    private Integer y;
    
    public Punto(Integer x, Integer y){
        this.x=x;
        this.y=y;
    }
    public void setx(Integer x){
        this.x=x;
    }
        public Integer getx(){
       return x;
        }
       public void sety(Integer y){
        this.y=y;
    
       }
       public Integer gety(){
       return y;
   }
   }

