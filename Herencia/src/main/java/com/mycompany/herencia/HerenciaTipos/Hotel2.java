/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.HerenciaTipos;

/**
 *
 * @author Admin
 */
public class Hotel2 extends Hotel1 {
    //Aqui se hace el extends a la segund herencia, a la Hotel1, adquiriendo sus atributos y los de la clase padre
    protected boolean cajaSeguridad = true;

    public Hotel2(Double precio, Double superficie, Integer cantidadHabitaciones) {
        //Aqui se llaman los atributos de la clase padre y de la primera herencia
        super(precio, superficie, cantidadHabitaciones);
    }
    
    
}
