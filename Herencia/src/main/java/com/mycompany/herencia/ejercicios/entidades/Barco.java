/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.ejercicios.entidades;

import com.mycompany.herencia.interfaces.Alquilar;
import java.text.ParseException;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Double getPotCV() {
        return potCV;
    }

    public void setPotCV(Double potCV) {
        this.potCV = potCV;
    }

    public Integer getAnioF() {
        return anioF;
    }

    public void setAnioF(Integer anioF) {
        this.anioF = anioF;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    public Integer getCam() {
        return cam;
    }

    public void setCam(Integer cam) {
        this.cam = cam;
    }

  

  
    
    public Barco crearBarco() throws ParseException{
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
                int mil = 86400000;
                int dias = (int) (((b1.getFechaA().getTime()-b1.getFechaD().getTime()))/mil);
                Double modulo = (b1.getEslora()*10) * dias;
                Double alqui = modulo + b1.getCam() + b1.getPotCV();
                return alqui;
            case "motor":
                mil = 86400000;
                dias = (int) (((b1.getFechaA().getTime()-b1.getFechaD().getTime()))/mil);
                modulo = (b1.getEslora()*10)  * dias;
                alqui = modulo + b1.getPotCV();
                return alqui;
            case "velero":
                mil = 86400000;
                dias = (int) (((b1.getFechaA().getTime()-b1.getFechaD().getTime()))/mil);
                modulo = (b1.getEslora()*10)  * dias;
                alqui = modulo + b1.getMastiles();
                return alqui;
            case "otro":
                mil = 86400000;
                dias = (int) (((b1.getFechaA().getTime()-b1.getFechaD().getTime()))/mil);
                 modulo = (b1.getEslora()*10)  * dias;
                 alqui = modulo;
                return alqui;
            default:
                throw new AssertionError();
        }
    }


    
}
