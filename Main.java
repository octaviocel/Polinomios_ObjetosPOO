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
public class Main {
    public static void main(String[] args) {
            Polinomio uno = new Polinomio();
            Polinomio dos = new Polinomio();
            Polinomio tres = new Polinomio();
            Polinomio cuatro = new Polinomio();
            
            uno.agregar(5, 2);
            uno.agregar(7, 3);
            uno.agregar(4, 2);
            System.out.println("Uno");
            uno.imprimir();
            
            dos.agregar(5, 3);
            dos.agregar(-2, 1);
            dos.agregar(-2, 2);
            System.out.println("Dos");
            dos.imprimir();
            System.out.println("Suma 1+2");
            dos.agregar(uno);
            dos.imprimir();
            
            tres.agregar(5, 2);
            tres.agregar(7, 1);
            System.out.println("Tres");
            tres.imprimir();
            
            cuatro.agregar(2, 2);
            cuatro.agregar(-2, 1);
            System.out.println("Cuatro");
            cuatro.imprimir();
            
            tres.restar(cuatro);
            System.out.println("Resta 3-4");
            tres.imprimir();
            
            System.out.println("Multiplicacion 2*3");
            dos.multipliclar(tres);
            dos.imprimir();
    }

}
