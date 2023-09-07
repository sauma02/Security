/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.ejercicios.entidades;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Electrodomestico {
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
       if((Character.toLowerCase(letra)!='A') && (Character.toLowerCase(letra)!='B') && (Character.toLowerCase(letra)!='C') && (Character.toLowerCase(letra)!='D') && (Character.toLowerCase(letra)!='E')&& (Character.toLowerCase(letra)!='F')){
       letra = 'F';
       return letra;
           
       }else{
           return letra;
       }
    }
    public String comprobarColor(String color){
        if((!"Blanco".equals(color.toLowerCase())) && (!"Negro".equals(color.toLowerCase())) && (!"Rojo".equals(color.toLowerCase())) && (!"Azul".equals(color.toLowerCase())) && (!"Gris".equals(color.toLowerCase())) ){
            color = "Blanco";
            return color;
            
        }else{
            return color;
        }
    }
    public Electrodomestico crearElectrodomestico(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el color del electrodomestico (Entre estos colores: Blanco, Negro, Rojo, Azul, Gris)");
        String color = leer.next();
        System.out.println("Ingrese el tipo de consumo energetico del electrodomestico (Entre estos tipos: A, B, C, D, E, F)");
        char letra = leer.next().charAt(0);
        System.out.println("Ingrese el peso total del electrodomestico en Kg");
        Double peso = leer.nextDouble();
        
        Electrodomestico e1 = new Electrodomestico(1000d, color, letra, peso);
        return e1;
    }
    public Double precioFinal(){
        Double preFin = 0.0;
        if(this.getPeso() >= 1 && this.getPeso() <= 19){
            this.precio = this.precio + 100;
            switch (this.getConsumoE()) {
                case 'A':
                case 'a':
                    this.precio += 1000;
                    return this.precio;
                case 'B':
                case 'b':
                    this.precio += 800;
                    return this.precio;
                case 'C':
                case 'c':
                    this.precio += 600;
                    return this.precio;
                case 'D':
                case 'd':
                    this.precio += 500;
                    return this.precio;
                case 'E':
                case 'e':
                    this.precio += 300;
                    return this.precio;
                case 'F':
                case 'f':
                    this.precio += 100;
                    return this.precio;
                
                default:
                    return this.precio;
            }
        }else if(this.getPeso()>= 20 && this.getPeso()<= 49){
            this.precio = this.precio + 500;
            switch (this.getConsumoE()) {
                case 'A':
                case 'a':
                    this.precio += 1000;
                    return this.precio;
                case 'B':
                case 'b':
                    this.precio += 800;
                    return this.precio;
                case 'C':
                case 'c':
                    this.precio += 600;
                    return this.precio;
                case 'D':
                case 'd':
                    this.precio += 500;
                    return this.precio;
                case 'E':
                case 'e':
                    this.precio += 300;
                    return this.precio;
                case 'F':
                case 'f':
                    this.precio += 100;
                    return this.precio;
                
                default:
                    return this.precio;
            }
        }else if(this.getPeso() >= 50 && this.getPeso() <= 79){
            this.precio = this.precio + 800;
            switch (this.getConsumoE()) {
                case 'A':
                case 'a':
                    this.precio += 1000;
                    return this.precio;
                case 'B':
                case 'b':
                    this.precio += 800;
                    return this.precio;
                case 'C':
                case 'c':
                    this.precio += 600;
                    return this.precio;
                case 'D':
                case 'd':
                    this.precio += 500;
                    return this.precio;
                case 'E':
                case 'e':
                    this.precio += 300;
                    return this.precio;
                case 'F':
                case 'f':
                    this.precio += 100;
                    return this.precio;
                
                default:
                    return this.precio;
            }
        }else if(this.getPeso() > 80){
            this.precio = this.precio + 1000;
            switch (this.getConsumoE()) {
                case 'A':
                case 'a':
                    this.precio += 1000;
                    return this.precio;
                case 'B':
                case 'b':
                    this.precio += 800;
                    return this.precio;
                case 'C':
                case 'c':
                    this.precio += 600;
                    return this.precio;
                case 'D':
                case 'd':
                    this.precio += 500;
                    return this.precio;
                case 'E':
                case 'e':
                    this.precio += 300;
                    return this.precio;
                case 'F':
                case 'f':
                    this.precio += 100;
                    return this.precio;
                
                default:
                    return this.precio;
            }
        }else{
            return this.precio;
        }
        
        
    }

    @Override
    public String toString() {
        return "Electromestico{Precio= "+precio+" Color= "+color+" ConsumoE= "+consumoE+" Peso= "+peso;
    }
    
}
      
