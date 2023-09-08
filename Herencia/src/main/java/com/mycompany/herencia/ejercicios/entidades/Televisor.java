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
public final class Televisor extends Electrodomestico{
    private Double resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Double resolucion, boolean sintonizador, Double precio, String color, char consumoE, Double peso) {
        super(precio, color, consumoE, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    public Televisor crearTelevisor(){
        Electrodomestico e1 = new Electrodomestico().crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la resolucion del televisor en pulgadas");
        Double resolucion = leer.nextDouble();
        System.out.println("¿Cuenta con sintonizador integrado?");
        String op = leer.next().toLowerCase();
        switch (op) {
            case "si":
                boolean sintonizador = true;
                break;
            case "no":
                sintonizador = false;
                break;
            default:
                System.out.println("Error");
        }
        Televisor t1 = new Televisor(resolucion, sintonizador, e1.precio, e1.color, e1.consumoE, e1.peso);
        System.out.println("El color del televisor es: "+t1.comprobarColor(e1.color));
        System.out.println("El tipo de energia es: "+t1.comprobarConsumoEnergetico(e1.consumoE));
        return t1;
    }
    @Override
    public Double precioFinal(){
        super.precioFinal();
        if(this.resolucion > 40){
            this.precio = this.precio + (this.precio*0.3);
           if(this.sintonizador == true){
               this.precio = this.precio + 500;
               this.setPrecio(this.precio);
               return this.precio;
           }else{
               this.setPrecio(this.precio);
               return this.precio;
           }
        }else{
            if(this.sintonizador == true){
                this.precio = this.precio + 500;
                this.setPrecio(this.precio);
                return this.precio;
                
            }else{
                return this.precio;
            }
        }
    }
}
