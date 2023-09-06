/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.herencia.clasesAbstractas.edificio;

import com.mycompany.herencia.clasesAbstractas.CasaCampo;
import com.mycompany.herencia.clasesAbstractas.Edificio;
import com.mycompany.herencia.clasesAbstractas.Estructura;

/**
 *
 * @author Admin
 */
public class EdificioMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //No se puede inicializar debido a que al ser una clase abstracta no tiene metodos ni informacion establecida que pueda usar
        //Estructura e1 = new Estructura();
        //No se pueden sacar los getters y setters de estructura, porque se genera un objeto estructura y se hace nacer como una de las clases hija
        //se pone 1000d para decir que son double
        
        //Si utilizo directamente las hijas, le puedo quitar los getters y setters
        Estructura e1 = new CasaCampo(true, 1000d);
        e1.calcularSuperficie(10, 30);
        System.out.println(e1.getSuperficieCubierta()+" mt2");
 
        Estructura e2 = new Edificio(4, 300d);
        e2.calcularSuperficie(10, 30);
        System.out.println(e2.getSuperficieCubierta()+" mt2");
 
        
    }
    
}
