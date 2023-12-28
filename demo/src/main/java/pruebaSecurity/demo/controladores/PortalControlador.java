/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaSecurity.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */
@RestController
public class PortalControlador {
    @GetMapping("/")
    public String portal(){
        return ("Hola admin");
    }
    @GetMapping("/admin")
    public String admin(){
        return "DashboardAdmin";
    }
    @GetMapping("/visitante")
    public String visitante(){
        return "Hola visitante";
    }
}
