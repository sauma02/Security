/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.herencia.interfaces;

/**
 *
 * @author Admin
 */
public interface AccionMascota {
    //Se establece una nueva interfaz mas general, se implementa con implements y de esta manera se estableces los metodos generales abstracos, 
    //adentro se les establece la accion
    //Se establece que la clase Mascota sea Final, para que no hereda a mas clases
    
    public void pasear(int vueltas);
    public int molestarDueño();
    public void comerAlimento(int cantidad);
    
    
}
