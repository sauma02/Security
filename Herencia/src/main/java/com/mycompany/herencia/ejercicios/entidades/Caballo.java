/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.ejercicios.entidades;

/**
 *
 * @author Admin
 */
public final class Caballo extends Animal {

    public Caballo(String nombre, String alimento, Integer edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public void Alimentarse() {
        System.out.println("Alimentando "+this.alimento+" para el "+this.razaAnimal+" "+this.nombre);
    }
    
}
