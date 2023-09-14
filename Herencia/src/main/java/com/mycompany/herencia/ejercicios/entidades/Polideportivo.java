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
public class Polideportivo extends Edificio {
    private String nombre, tipoTecho;

    public Polideportivo() {
    }
    

    public Polideportivo(String nombre, String tipoTecho) {
        this.nombre = nombre;
        this.tipoTecho = tipoTecho;
    }

    public Polideportivo(String nombre, String tipoTecho, Double ancho, Double largo, Double alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.tipoTecho = tipoTecho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoTecho() {
        return tipoTecho;
    }

    public void setTipoTecho(String tipoTecho) {
        this.tipoTecho = tipoTecho;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }
    public Polideportivo crearPolideportivo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del edificio");
        String nombre = leer.next().toLowerCase();
        System.out.println("Inbgrese el tipo de techo");
        String tipotecho = leer.next().toLowerCase();
        System.out.println("Ingrese el ancho, largo y alto en el orden respectivo en metros");
        Double ancho = leer.nextDouble();
        Double largo = leer.nextDouble();
        Double alto = leer.nextDouble();
        Polideportivo p1 = new Polideportivo(nombre, tipotecho, ancho, largo, alto );
        return p1;
    }
    @Override
    public Double calcularSuperficie(Edificio e1) {
        Double superficie = e1.getAncho() * e1.getLargo();
        return superficie;
        
    }

    @Override
    public Double calcularVolumen(Edificio e1) {
         Double volumen = e1.getAlto() * e1.getAncho() * e1.getLargo();
        return volumen;
    }

    @Override
    public String nombreEdi() {
        String nombre1 = "Polideportivo"+this.nombre;
        return nombre1;
                
        
    }
    
}
