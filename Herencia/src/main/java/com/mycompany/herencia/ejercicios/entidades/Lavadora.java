/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.ejercicios.entidades;

import java.util.Scanner;

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
   
  public Lavadora crearLavadora(){
      Electrodomestico e1 = new Electrodomestico().crearElectrodomestico();
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese la carga de la lavadora en kg");
      Double carga = leer.nextDouble();
      Lavadora l1 = new Lavadora(carga, e1.getPrecio(), e1.getColor(), e1.consumoE, e1.peso);
      System.out.println("El color es: "+l1.comprobarColor(e1.color));
      System.out.println("El tipo de Energia es: "+l1.comprobarConsumoEnergetico(e1.getConsumoE()));
      
      return l1;
  }
    @Override
  public Double precioFinal(){
      super.precioFinal();
      if(this.carga> 30){
          this.precio = this.precio + 500;
          this.setPrecio(this.precio);
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
