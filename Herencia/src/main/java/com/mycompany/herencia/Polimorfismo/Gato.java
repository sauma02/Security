/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.Polimorfismo;

/**
 *
 * @author Admin
 */
public final class Gato extends Animal {
    private String razaGatuna;

    public Gato(String razaGatuna, Integer patas, boolean cola, Integer aniosDeVida, Double energia) {
        super(patas, cola, aniosDeVida, energia);
        this.razaGatuna = razaGatuna;
    }

    public String getRazaGatuna() {
        return razaGatuna;
    }

    public void setRazaGatuna(String razaGatuna) {
        this.razaGatuna = razaGatuna;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public Integer getAniosDeVida() {
        return aniosDeVida;
    }

    public void setAniosDeVida(Integer aniosDeVida) {
        this.aniosDeVida = aniosDeVida;
    }

    public Double getEnergia() {
        return energia;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }
    public void ronronear(){
        System.out.println("Prrrrrrrrr");
    }
    @Override
    public void calcularEdad() {
        System.out.println("La edad gatuna para "+this.razaGatuna+" es "+ (aniosDeVida * 8));
    }
    @Override
    //La palabra super llama al padre de la clase, llama el metodo de hacer ruido de Animal, y luego va hacer el establecido por nosotros
    public void hacerRuido(){
        super.hacerRuido();
        System.out.println("Miaaaaauuu");
    }
    
}
