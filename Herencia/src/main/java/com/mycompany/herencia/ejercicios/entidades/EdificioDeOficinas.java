/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.ejercicios.entidades;

/**
 *
 * @author Admin
 */
public final class EdificioDeOficinas extends Edificio {
    private Integer numOf, cantPOf, cantP;

    public EdificioDeOficinas(Integer numOf, Integer cantPOf, Integer cantP) {
        this.numOf = numOf;
        this.cantPOf = cantPOf;
        this.cantP = cantP;
    }

    public EdificioDeOficinas(Integer numOf, Integer cantPOf, Integer cantP, Double ancho, Double largo, Double alto) {
        super(ancho, largo, alto);
        this.numOf = numOf;
        this.cantPOf = cantPOf;
        this.cantP = cantP;
    }

    public Integer getNumOf() {
        return numOf;
    }

    public void setNumOf(Integer numOf) {
        this.numOf = numOf;
    }

    public Integer getCantPOf() {
        return cantPOf;
    }

    public void setCantPOf(Integer cantPOf) {
        this.cantPOf = cantPOf;
    }

    public Integer getCantP() {
        return cantP;
    }

    public void setCantP(Integer cantP) {
        this.cantP = cantP;
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
    public void cantidadPersonas(EdificioDeOficinas e1){
        Integer personasP = (e1.getCantPOf()*e1.getNumOf())/e1.getCantP();
        System.out.println("Personas por piso: "+personasP);
        Integer personasE = personasP * e1.getCantP();
        System.out.println("Personas en todo el edificio: "+personasE);
        
        
    }

    @Override
    public Double calcularSuperficie() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Double calcularVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
