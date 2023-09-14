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
public abstract class Edificio {
    protected Double ancho, largo, alto;

    public Edificio() {
    }

    public Edificio(Double ancho, Double largo, Double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
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
    public abstract String nombreEdi();
    public abstract Double calcularSuperficie(Edificio e1);
    public abstract Double calcularVolumen(Edificio e1);
}
