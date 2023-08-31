/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.HerenciaTipos;

/**
 *
 * @author Admin
 */
//Para determinar que una clase es de la misma familia, se utiliza la palabra reservada extends
public class Hotel1 extends Hotel {
    protected Double precio;
    protected Double superficie;
    protected boolean bano = true;
    protected boolean ascensor = true;
    protected boolean calefaccion = true;
//Al crear el constructor herada el atributo de cantidad de habitaciones
    public Hotel1(Double precio, Double superficie, Integer cantidadHabitaciones) {
        //Super hace referencia que se esta llamando o enviando informacion al padre de la clase
        super(cantidadHabitaciones);
        this.precio = precio;
        this.superficie = superficie;
    }
 
    
    }
    
    

