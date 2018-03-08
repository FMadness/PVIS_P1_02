/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polinomio;

/**
 *
 * @author josem
 */
public class Monomio {
    private Integer coeficiente;
    private Integer exponente;
    
    public Monomio(Integer c, Integer e){
    this.coeficiente=c;
    this.exponente=e;
    }
    public void setcoeficiente(Integer c){
        this.coeficiente = c;
    }
    public Integer getcoeficiente(){
        return this.coeficiente;
    }
    public void setexponente(Integer e){
        this.exponente = e;
    }
    public Integer getexponente(){
        return this.exponente;
    }
    public String toString(){
        if(coeficiente>0){
            return String.format("+%dx^%d",coeficiente,exponente);
            
        }else
            return String.format("%dx^%d",coeficiente, exponente);
    }
    
}
