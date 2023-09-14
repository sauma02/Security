/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.herencia.ejercicios.mains;

import com.mycompany.herencia.ejercicios.entidades.Edificio;
import com.mycompany.herencia.ejercicios.entidades.EdificioDeOficinas;
import com.mycompany.herencia.ejercicios.entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Construcciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        List<Edificio> edificios = new ArrayList();
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite el numero del edificio que desea crear: \n1. Edificio de oficinas\n2. Polideportivo ");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("--EdificioDeOficinas--");
                    EdificioDeOficinas e1 = new EdificioDeOficinas().crearEdificioDeOficinas();
                    System.out.println("Edificio creado");
                    edificios.add(e1);
                    
                    break;
                case 2:
                    System.out.println("--Polideportivo--");
                    Polideportivo p1 = new Polideportivo().crearPolideportivo();
                    System.out.println("Polideportivo Creado");
                    edificios.add(p1);
            
                    break;
                default:
                    System.out.println("Ingrese solo las opciones 1 o 2");
                    
                    
            }
        }
        for (Edificio e : edificios) {
            
            System.out.println("Superficie del edificio "+e.nombreEdi()+" es: "+e.calcularSuperficie(e)+" m2");
            System.out.println("Volumen del edificio "+e.nombreEdi()+" es: "+e.calcularVolumen(e)+" m3");
            System.out.println("Polideportivos sin techo: "+edificios);
        }
        List<Edificio> techo = Edificio.getEdificios();
        }
    }
    
}
