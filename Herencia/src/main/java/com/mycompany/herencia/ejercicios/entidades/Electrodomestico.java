/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.ejercicios.entidades;

/**
 *
 * @author Admin
 */
public abstract class Electrodomestico {
    protected Double precio;
    protected String color;
    protected char consumoE;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumoE, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoE = consumoE;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(char consumoE) {
        this.consumoE = consumoE;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public char comprobarConsumoEnergetico(char letra){
        letra = 'F';
        return letra;
    }
    public String comprobarColor(String color){
        color = "Blanco";
        return color;
    }
    public Electrodomestico crearElectrodomestico(){
        Electrodomestico e1 = new Electrodomestico(1000d, "Negro", 'B', 30.3) {
            @Override
            public void precioFinal() {
                if(e1.getConsumoE()){
            }
        };
        return e1;
    }
    public abstract void precioFinal();
    
}
