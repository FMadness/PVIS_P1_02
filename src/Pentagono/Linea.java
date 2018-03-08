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
public class Linea {
    private Punto inicio;
    private Punto fin;
    public Linea(Punto i, Punto f){
        this.inicio=i;
        this.fin=f;
        
    }
      
    
    public Linea(Integer x1, Integer x2, Integer y1, Integer y2){
        this.inicio=new Punto(x1,y1);
        this.fin=new Punto(x2,y2);
        
    }
    
    
    public double distancia(){
        Integer x=fin.getx()-inicio.getx();
        Integer y=fin.gety()-inicio.gety();
        double x2= Math.pow(x,2);
        double y2= Math.pow(y,2);
        double xy=x2+y2;
        return Math.sqrt(xy);
                
    }
     public String toString(){
         
        return String.format("[%d,%d],[%d,%d}",inicio.getx(),inicio.gety(),fin.getx(),fin.gety());
       
    }
}
