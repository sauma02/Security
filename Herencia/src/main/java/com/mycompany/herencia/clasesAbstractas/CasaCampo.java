/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.clasesAbstractas;

/**
 *
 * @author Admin
 */
public final class CasaCampo extends Estructura{
    //Se pone el booleano para determinar si existe o no una casa de arbol en casa de campo
    private boolean casaArbol;

    public CasaCampo(boolean casaArbol, Double superficieTotal) {
        super(superficieTotal);
        this.casaArbol = casaArbol;
    }
//Al ser booleano no se usa ni get ni set, sino IS para determinar si es o no
    public boolean isCasaArbol() {
        return casaArbol;
    }

    public void setCasaArbol(boolean casaArbol) {
        this.casaArbol = casaArbol;
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
    //El mismo metodo calcularSuperficie, cambiar depéndiendo la clase, en este caso, no se añaden pisos ya que casa de campo no tiene
    //Solo se calcular ancho por largo
    public void calcularSuperficie(double ancho, double largo) {
        this.superficieCubierta = ancho * largo;
    }
    
}
