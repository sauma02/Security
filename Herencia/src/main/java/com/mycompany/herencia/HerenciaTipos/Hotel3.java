/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.HerenciaTipos;

/**
 *
 * @author Admin
 */
public class Hotel3 extends Hotel2{
    protected boolean aireAcondicionado = true;
    protected boolean bar = true;

    public Hotel3(Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(precio, superficie, cantidadHabitaciones);
    }
    
    
}
