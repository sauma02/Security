/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.herencia.ejercicios.mains;


import com.mycompany.herencia.ejercicios.entidades.Animal;
import com.mycompany.herencia.ejercicios.entidades.Caballo;
import com.mycompany.herencia.ejercicios.entidades.Gato;
import com.mycompany.herencia.ejercicios.entidades.Perro;



/**
 *
 * @author Admin
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal p1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        p1.Alimentarse();
        System.out.println("-------------------");
        Animal p2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        p2.Alimentarse();
        System.out.println("-------------------");
        Animal g1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        g1.Alimentarse();
        System.out.println("-------------------");
        Animal c1 = new Caballo("Spark", "Pasto", 25, "Fino");
        c1.Alimentarse();
        System.out.println("-------------------");
    }
    
}
