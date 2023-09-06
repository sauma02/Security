/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.clasesAbstractas;

/**
 *
 * @author Admin
 */
public final class Edificio extends Estructura {
//Se implementa el metodo abstracto directamente en la clase, para que no mande error
    private Integer pisos;

    public Edificio(Integer pisos, Double superficieTotal) {
        super(superficieTotal);
        this.pisos = pisos;
    }

    public Integer getPisos() {
        return pisos;
    }
//Getters y setters de padre e hija
    public void setPisos(Integer pisos) {
        this.pisos = pisos;
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

    @Override
    //Se usa el this pisos para utilizar el atributo de esta clase
    public void calcularSuperficie(double ancho, double largo) {
       this.superficieCubierta = ancho * largo * this.pisos;
    }
    
    
}
