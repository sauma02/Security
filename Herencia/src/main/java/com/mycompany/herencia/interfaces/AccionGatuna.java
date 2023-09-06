/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.herencia.interfaces;

/**
 *
 * @author Admin
 */
public interface AccionGatuna {
    //EL METODO NO TIENE CUERPO, DESPUES SE DEFINE EL ACCIONAR, se establece el contrato, para poder usar este metodo, si o si se tiene que manejar el concepto
    //que va llegar una variable para poder accionar el metodo
    //Se pueden implementar multiples interfaces para una sola clase
    //Para que la clase pueda utilizar las dos acciones perruna y gatuna, se utiliza el IMPLEMENTS y se ponen las dos interfaces
    //Estando en la clase, se acciones de la siguiente manera, @Override, y dentro del metodo creado se pone la accion
    public void maullar(int db);
}
