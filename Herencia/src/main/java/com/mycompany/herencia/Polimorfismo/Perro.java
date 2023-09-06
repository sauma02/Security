/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.Polimorfismo;

/**
 *
 * @author Admin
 */
public final class Perro extends Animal{
    private String razaPerruna;

    public Perro(String razaPerruna, Integer patas, boolean cola, Integer aniosDeVida, Double energia) {
        super(patas, cola, aniosDeVida, energia);
        this.razaPerruna = razaPerruna;
    }

    public String getRazaPerruna() {
        return razaPerruna;
    }

    public void setRazaPerruna(String razaPerruna) {
        this.razaPerruna = razaPerruna;
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
    
    public void jugarEnParque(int tiempo){
        for (int i = 0; i < tiempo; i++) {
            energia -=10;
        }
        System.out.println("La cantidad de energia restante es "+this.energia);
    }
    

    @Override
    public void calcularEdad() {
        System.out.println("La edad gatuna para "+this.razaPerruna+" es "+ (aniosDeVida * 7));
    }
    @Override
    //La palabra super llama al padre de la clase, llama el metodo de hacer ruido de Animal, y luego va hacer el establecido por nosotros
    //Adapta de manera no abstracta 

    public void hacerRuido(){
        super.hacerRuido();
        System.out.println("Guaaaaaau");
    }
}
