/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.HerenciaTipos;

/**
 *
 * @author Admin
 */
public class Hotel {
    //Protected significa que es publico para la familia y privado para las clases externas a la familia
    
    protected Integer cantidadHabitaciones;
    //El constructor se construye de esta manera
    
    public Hotel(Integer cantidadHabitaciones){
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }
    
}
