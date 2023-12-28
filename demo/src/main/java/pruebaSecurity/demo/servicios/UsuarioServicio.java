/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaSecurity.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pruebaSecurity.demo.repositorios.UsuarioRepositorio;

/**
 *
 * @author Admin
 */
@Service
public class UsuarioServicio implements UserDetailsService {
    @Autowired
    private final UsuarioRepositorio uR;

    public UsuarioServicio(UsuarioRepositorio uR) {
        this.uR = uR;
    }
    

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return uR.findByUsername(username);
    }
    
}
