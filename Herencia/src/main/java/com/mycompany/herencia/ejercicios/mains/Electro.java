/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.herencia.ejercicios.mains;

import com.mycompany.herencia.ejercicios.entidades.Electrodomestico;
import com.mycompany.herencia.ejercicios.entidades.Lavadora;
import com.mycompany.herencia.ejercicios.entidades.Televisor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Electro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
       List<Electrodomestico> electro = new ArrayList(4);
       double suma = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el electrodomestico que desea llevar y sus especificaciones: \n1. Lavadora\n2. Televisor");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                 System.out.println("--Lavadora--");
                 Electrodomestico l = new Lavadora().crearLavadora();
                    System.out.println("Precio Final de la lavadora: "+l.precioFinal());
                 electro.add(l);
                    break;
                case 2:
                  System.out.println("--Televisor--");
                  Electrodomestico t = new Televisor().crearTelevisor();
                  System.out.println("Precio Final del televisor: "+t.precioFinal());
                  electro.add(t);
                  break;
                default:
                    throw new AssertionError();
            }
         
              
        }
        for (Electrodomestico i : electro) {
            suma = suma + i.getPrecio();
            ;
        }
        System.out.println("Suma de todos los precios finales: "+suma);
        
        
        
        
        
                
    
    }
    
}
