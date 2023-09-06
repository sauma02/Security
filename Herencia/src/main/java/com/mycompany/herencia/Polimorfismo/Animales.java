/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.herencia.Polimorfismo;

/**
 *
 * @author Admin
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal g = new Gato("Naranjoso", 4, true, 5, 1000d);
        Animal p = new Perro("Beagle", 4, true, 13, 1000d);
        g.calcularEdad();;
        //El hace el polimorfismo directamente en hacer ruido ya que este se sobreescribe en gato al cual se esta instanciando
        g.hacerRuido();
        //Metodo propio del gato
        //Si creampos las clases directamente como Animal no se va acceder al metodo propio como gato
        //g.ronronear();
        System.out.println("-------------------------------");
        p.calcularEdad();
        p.hacerRuido();
        //Metodo propio del perro
        //p.jugarEnParque(10);
    }
    
}
