/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.herencia.ejercicios.mains;

import com.mycompany.herencia.ejercicios.entidades.Electrodomestico;
import com.mycompany.herencia.ejercicios.entidades.Lavadora;

/**
 *
 * @author Admin
 */
public class Electro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico e1 = new Lavadora().crearLavadora();
        
        System.out.println(e1.crearElectrodomestico());
        
        
        
        
                }
    
}
