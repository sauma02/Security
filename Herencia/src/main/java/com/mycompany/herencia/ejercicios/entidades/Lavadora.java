/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.ejercicios.entidades;

/**
 *
 * @author Admin
 */
public final class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(double carga, Double precio, String color, char consumoE, Double peso) {
        super(precio, color, consumoE, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
   
  public Electrodomestico crearLavadora(){
      super.crearElectrodomestico();
      Lavadora l1 = new Lavadora(10, super.precio, super.color, super.consumoE, super.peso);
      System.out.println("El color es: "+l1.comprobarColor(super.color));
      System.out.println("El tipo de Energia es: "+l1.comprobarConsumoEnergetico(consumoE));
      l1.comprobarConsumoEnergetico(consumoE);
      return l1;
  }
    @Override
  public Double precioFinal(){
      super.precioFinal();
      if(this.getCarga()> 30){
          this.precio = this.precio + 500;
          return this.precio;
      }else{
          return this.precio;
      }
  }
       @Override
    public String toString() {
        return "Lavadora{Carga= "+carga+" Precio= "+precio+" Color= "+color+" ConsumoE= "+consumoE+" Peso= "+peso;
    }
}
