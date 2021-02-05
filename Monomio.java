/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolinomiosObj;

/**
 *
 * @author DELL
 */
public class Monomio {
    private Integer coeficiente;
    private Integer exponente;
    private Monomio sig;
    
    public Monomio(Integer coeficiente, Integer exponente){
        this.coeficiente=coeficiente;
        this.exponente = exponente;
        this.sig =null;
    }
    
    
    public String toString(){
        return String.format("%dx^%d", this.getCoeficiente(), this.getExponente());
    }

    public Integer getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(Integer coeficiente) {
        this.coeficiente = coeficiente;
    }

    public Integer getExponente() {
        return exponente;
    }

    public void setExponente(Integer exponente) {
        this.exponente = exponente;
    }

    public Monomio getSig() {
        return sig;
    }

    public void setSig(Monomio sig) {
        this.sig = sig;
    }
    
   
}
