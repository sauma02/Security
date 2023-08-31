/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.HerenciaTipos;

/**
 *
 * @author Admin
 */
public final class Hotel5 extends Hotel4{
    //Se utiliza para finalizar la herencia la palabra reservada final, de esta manera se establece que nadie podra heredar nada a partir de hotel 5 en adelante
    protected boolean casino = true;
    protected boolean Restaurante = true;
//Aqui el hotel 5 contiene, las herencias de todos los anteriores hoteles, al igual que de la padre, con la palabra super
    public Hotel5(Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(precio, superficie, cantidadHabitaciones);
    }
    
}
