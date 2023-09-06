/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.clasesAbstractas;

/**
 *
 * @author Admin
 */
public abstract class Estructura {
    //Se establece la clase abstracta directamente en la declaracion de la clase
    protected Double superficieCubierta;
    protected Double superficieTotal;
//Solo se establece en el constructor la superficie total
    public Estructura(Double superficieTotal) {
        
        this.superficieTotal = superficieTotal;
    }

    public Double getSuperficieCubierta() {
        return superficieCubierta;
    }

    public void setSuperficieCubierta(Double superficieCubierta) {
        this.superficieCubierta = superficieCubierta;
    }

    public Double getSuperficieTotal() {
        return superficieTotal;
    }

    public void setSuperficieTotal(Double superficieTotal) {
        this.superficieTotal = superficieTotal;
    }
    //Los metodos abstractos no tienen cuerpo, de esto se encarga la clase que lo llame
    public abstract void calcularSuperficie(double ancho, double largo);
}
