/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.ejercicios.entidades;

import com.mycompany.herencia.interfaces.calculoFormas;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Circulo implements calculoFormas {
    private Double pi = Math.PI;
    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getPi() {
        return pi;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    public Circulo crearCirculo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        Double radio = leer.nextDouble();
        Circulo c1 = new Circulo(radio);
        return c1;
    }
    @Override
    public Double area() {
        Double area = this.getPi() * Math.pow(this.getRadio(), 2);
        return area;
    }

    @Override
    public Double perimetro() {
        Double perimetro = this.getPi() * (this.getRadio()*2) ;
        return perimetro;
        
    }
    
}
