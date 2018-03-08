/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fecha;

/**
 *
 * @author josem
 */
public class Fecha {
     private Integer d;
    private Integer m;
    private Integer a;
    private Integer da;
 public Fecha(Integer d, Integer m, Integer a, Integer da){
     this.a=a;
     this.d=d;
     this.m=m;
     this.da=da;
 }

    
    public String toString( ){
       return d+"/"+m+"/"+a;
    }
    private Integer diasMes(){
        switch(this.m){
            case 1: 
            case 3:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(this.a%4==0){
                    return 29;
                }else{
                    return 28;
                }
            default :return 0;
               
        }
       
    } 
     public void setDia(Integer dia){
       this.d=dia;
       
   }
    public Integer getDia(){
       return d;
       
   }
   public void setMes(Integer mes){
      this.m=mes;
   }
    public Integer getMes(){
       return m;
   }

   public void setAnio(Integer anio){
      this.a=anio;
  
}
    public Integer getAnio(){
       return a;
   }
    
    public void setDiasau(Integer diasau){
        this.da=diasau;
    }
    public Integer getDiasau(){
        return da;
    }
    
    public void Aumentar(){
      this.d++;
      if(this.d>diasMes()){
         this.d=1;
          this.m++;
          if(this.m>12){
              this.m=1;
              this.a++;
              
          }
          
      }
      
        
        
   }
    public void Aumentar (Integer n){
        for(int i=0; i<n; i++){
            this.Aumentar();
        }
     
}
}

