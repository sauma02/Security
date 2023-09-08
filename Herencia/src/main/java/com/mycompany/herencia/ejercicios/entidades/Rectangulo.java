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
public class Rectangulo implements calculoFormas {
    private Double base;
    private Double Altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double Altura) {
        this.base = base;
        this.Altura = Altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return Altura;
    }

    public void setAltura(Double Altura) {
        this.Altura = Altura;
    }
    
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base");
        Double base = leer.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        Double altura = leer.nextDouble();
        Rectangulo r1 = new Rectangulo(base, altura);
        return r1;
    }
    @Override
    public Double area() {
        Double area = this.getBase() * this.getAltura();
        return area;
    }

    @Override
    public Double perimetro() {
        Double perimetro = (this.getBase()+this.getAltura()) * 2;
        return perimetro;
    }
    
}
