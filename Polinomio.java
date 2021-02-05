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
public class Polinomio {
    
    private Monomio inicio;
    
    public Polinomio(){
        inicio = null;
    }
    
    public void agregar(Integer coeficiente, Integer exponente){
        Monomio nuevo = new Monomio(coeficiente,exponente);
        if(inicio !=null){
            nuevo.setSig(inicio);
        }
        inicio = nuevo;        
    }
    
    public void agregar(Polinomio polinomio){
        Monomio aux = polinomio.inicio;
        while(aux !=null){
            this.agregar(aux.getCoeficiente(), aux.getExponente());
            aux = aux.getSig();
        }
        this.simplificar();
    }
    
    public void imprimir(){
        Monomio aux= inicio;
        while(aux != null){
            System.out.print(aux+ " ");
            aux = aux.getSig();
        }
        System.out.println();
    }
    
    void simplificar(){
        Monomio aux = inicio;
        Integer p =0;
        while(aux != null){
            if(p< aux.getExponente()){
                p = aux.getExponente();
            }
            aux = aux.getSig();
        }
        Polinomio nuevo = new Polinomio();
        while(p!=-1){
            Monomio aux2=inicio;
            Integer aco=0;
            while(aux2 != null){
                if(p == aux2.getExponente()){
                    aco = aco + aux2.getCoeficiente();                    
                }
                aux2 = aux2.getSig();                               
            }
            if(aco != 0){
                    nuevo.agregar(aco, p);
            } 
            p--;
        }
        inicio = nuevo.inicio;
    }
    
    public void sumar(Polinomio poli){
        this.agregar(poli);
    }
    
    public void restar(Polinomio resta){
        Monomio aux = resta.inicio;        
        while(aux != null){
            this.agregar(-1*aux.getCoeficiente(), aux.getExponente());
            aux = aux.getSig();
        }
        this.simplificar();
    }
    
    public void multipliclar(Polinomio poli){
        Polinomio nuevo = new Polinomio();
        Monomio aux = inicio;
        while(aux!=null){
            Monomio aux2 = poli.inicio;
            while(aux2!=null){
                nuevo.agregar((aux.getCoeficiente()*aux2.getCoeficiente()),(aux.getExponente()+aux2.getExponente()));
                aux2 = aux2.getSig();
            }            
            aux = aux.getSig();
        }
        nuevo.simplificar();
        inicio = nuevo.inicio;
    }
}
