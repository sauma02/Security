/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.Polimorfismo;

/**
 *
 * @author Admin
 */
public abstract class Animal {
    protected Integer patas;
    protected boolean cola;
    protected Integer aniosDeVida;
    protected Double energia;

    public Animal(Integer patas, boolean cola, Integer aniosDeVida, Double energia) {
        this.patas = patas;
        this.cola = cola;
        this.aniosDeVida = aniosDeVida;
        this.energia = energia;
    }
    //En el polimorfismo el metodo se tiene que adaptar a quien lo llame
    public abstract void calcularEdad();
    public void hacerRuido(){
        System.out.println("**Respiracion Animal**");
    }
}
