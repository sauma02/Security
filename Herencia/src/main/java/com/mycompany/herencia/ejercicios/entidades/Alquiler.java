/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.ejercicios.entidades;

import com.mycompany.herencia.interfaces.Alquilar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Alquiler{
    private String nombre, id;
    private Date fechaD, fechaA;
    private Integer posicion;
    private String barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, String id, Date fechaD, Date fechaA, Integer posicion, String barco) {
        this.nombre = nombre;
        this.id = id;
        this.fechaD = fechaD;
        this.fechaA = fechaA;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaD() {
        return fechaD;
    }

    public void setFechaD(Date fechaD) {
        this.fechaD = fechaD;
    }

    public Date getFechaA() {
        return fechaA;
    }

    public void setFechaA(Date fechaA) {
        this.fechaA = fechaA;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public String getBarco() {
        return barco;
    }

    public void setBarco(String barco) {
        this.barco = barco;
    }
    
   public Alquiler crearAlquiler(){
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese su nombre");
       String nombre = leer.next();
       System.out.println("Ingrese su numero de identificacion");
       String id = leer.next();
       System.out.println("Ingrese la fecha del alquiler (d/mm/y)");
       String fecha1 = leer.next();
       DateFormat df = new SimpleDateFormat("dMMMMyyyy");
       Date fechaA = df.parse(fecha1);
       System.out.println("Ingrese la fecha de devolucion (d/mm/y)");
       String fecha2 = leer.next();
       Date fechaD = df.parse(fecha2);
       System.out.println("Ingrese el numero de la posicion donde estara el barco");
       Integer posicion = leer.nextInt();
       System.out.println("Ingrese que tipo de barco es(Velero, Motor, Yate, otro)");
       String barco = leer.next().toLowerCase();
       
       Alquiler a1 = new Alquiler(nombre, id, fechaA, fechaD, posicion, barco);
       return a1;
   }
  
}
