/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.herencia.ejercicios.mains;

import com.mycompany.herencia.ejercicios.entidades.Barco;
import java.text.ParseException;

/**
 *
 * @author Admin
 */
public class Puerto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Barco b1 = new Barco().crearBarco();
        System.out.println("El alquiler es: $"+b1.calcularAlquiler(b1));
    }
    
}
