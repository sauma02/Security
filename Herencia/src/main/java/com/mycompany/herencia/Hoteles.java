/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.herencia;

import com.mycompany.herencia.HerenciaTipos.Hotel;
import com.mycompany.herencia.HerenciaTipos.Hotel1;
import com.mycompany.herencia.HerenciaTipos.Hotel2;
import com.mycompany.herencia.HerenciaTipos.Hotel3;
import com.mycompany.herencia.HerenciaTipos.Hotel4;
import com.mycompany.herencia.HerenciaTipos.Hotel5;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Hoteles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea un array list para almacenar los hoteles
        //Si cambiamos el hotel dentro de la lista, tipo <hotel3> solo podran entrar hoteles desde 3 estrellas en adelante
        List<Hotel> hoteles = new ArrayList();
        Hotel1 h1 = new Hotel1(1500d, 9d, 10);
        Hotel2 h2 = new Hotel2(2500d, 12d, 15);
        Hotel3 h3 = new Hotel3(3500d, 15d, 20);
        Hotel4 h4 = new Hotel4(5000d, 20d, 30);
        Hotel5 h5 = new Hotel5(10000d, 30d, 50);
        
        hoteles.add(h1);
        hoteles.add(h2);
        hoteles.add(h3);
        hoteles.add(h4);
        hoteles.add(h5);
        //El concepto instanceof nos permite saber con base a que nacio el objeto, es decir, de donde proviene su herencia
        //Se pone el continue para que siga iterando los condicionales y determine que hotel es
        //Este ejemplo solo se da en las herencias multinivel
        for (Hotel aux : hoteles) {
            if(aux instanceof Hotel5){
                Hotel5 object = (Hotel5) aux;
                System.out.println("Soy un hotel 5");
                continue;
            }
             if(aux instanceof Hotel4){
                Hotel4 object = (Hotel4) aux;
                System.out.println("Soy un hotel 4");
                continue;
            }
              if(aux instanceof Hotel3){
                Hotel3 object = (Hotel3) aux;
                System.out.println("Soy un hotel 3");
                continue;
            }
               if(aux instanceof Hotel2){
                Hotel2 object = (Hotel2) aux;
                System.out.println("Soy un hotel 2");
                continue;
            }
                if(aux instanceof Hotel1){
                Hotel1 object = (Hotel1) aux;
                System.out.println("Soy un hotel 1");
                continue;
            }
        }
    }
    
}
