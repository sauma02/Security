/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.herencia.ejercicios.mains;

import com.mycompany.herencia.ejercicios.entidades.Circulo;
import com.mycompany.herencia.ejercicios.entidades.Rectangulo;

/**
 *
 * @author Admin
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--Circulo--");
        Circulo c1 = new Circulo().crearCirculo();
        System.out.println("--Rectangulo--");
        Rectangulo r1 = new Rectangulo().crearRectangulo();
        System.out.println("El area del circulo es: "+c1.area());
        System.out.println("El perimetro del circulo es: "+c1.perimetro());
        System.out.println("----------------------------");
        System.out.println("El area del rectangulo es: "+r1.area());
        System.out.println("El perimetro del rectangulo es: "+r1.perimetro());
    }
    
}
