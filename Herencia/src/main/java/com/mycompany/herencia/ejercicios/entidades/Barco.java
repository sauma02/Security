/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.ejercicios.entidades;

import com.mycompany.herencia.interfaces.Alquilar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Barco extends Alquiler implements Alquilar {
    private String matricula;
    private Double eslora, potCV;
    private Integer anioF, mastiles, cam;
    

    public Barco() {
    }

    public Barco(String matricula, Double eslora, Double potCV, Integer anioF, Integer mastiles, Integer cam) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.potCV = potCV;
        this.anioF = anioF;
        this.mastiles = mastiles;
        this.cam = cam;
    }

    public Barco(String matricula, Double eslora, Double potCV, Integer anioF, Integer mastiles, Integer cam, String nombre, String id, Date fechaD, Date fechaA, Integer posicion, String barco) {
        super(nombre, id, fechaD, fechaA, posicion, barco);
        this.matricula = matricula;
        this.eslora = eslora;
        this.potCV = potCV;
        this.anioF = anioF;
        this.mastiles = mastiles;
        this.cam = cam;
    }

  

  
    
    public Barco crearBarco(){
        Alquiler e1 = new Alquiler().crearAlquiler();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la matricula del Barco");
        String matricula = leer.next();
        System.out.println("Ingrese la longitud de la eslora en metros");
        Double eslora = leer.nextDouble();
        System.out.println("Ingrese el año de fabricacion completo");
        Integer anio = leer.nextInt();
        switch (e1.getBarco()) {
            case "yate":
                System.out.println("Ingrese la cantidad de camas");
                Integer cama = leer.nextInt();
                System.out.println("Ingrese la potencia del motor");
                Double potencia = leer.nextDouble();
                Barco b = new Barco(matricula, eslora, potencia, anio, 0, cama, e1.getNombre(), e1.getId(), e1.getFechaD(), e1.getFechaA(), e1.getPosicion(), e1.getBarco());
                return b;
                
            case "motor":
                System.out.println("Ingrese la potencia del motor");
                potencia = leer.nextDouble();
                Barco b1 = new Barco(matricula, eslora, potencia, anio, 0, 0, e1.getNombre(), e1.getId(), e1.getFechaD(), e1.getFechaA(), e1.getPosicion(), e1.getBarco());
                return b1;
            case "velero":
                System.out.println("Ingrese la cantidad de mastiles");
                Integer mastil = leer.nextInt();
                Barco b2 = new Barco(matricula, eslora, 0.0, anio, mastil, 0, e1.getNombre(), e1.getId(), e1.getFechaD(), e1.getFechaA(), e1.getPosicion(), e1.getBarco());
                return b2;
            case "otro":
                Barco b3 = new Barco(matricula, eslora, 0.0, anio, 0, 0, e1.getNombre(), e1.getId(), e1.getFechaD(), e1.getFechaA(), e1.getPosicion(), e1.getBarco());
                return b3;
            default:
                throw new AssertionError();
        }
       
        
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioF=" + anioF + '}';
    }

    @Override
    public Double calcularAlquiler(Barco b1) {
        switch (b1.getBarco()) {
            case "yate":
                Integer fecha1 = Integer.valueOf(b1.getFechaA());
                
                break;
            default:
                throw new AssertionError();
        }
    }


    
}
