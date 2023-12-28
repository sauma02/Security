/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaSecurity.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pruebaSecurity.demo.entidades.Usuario;

/**
 *
 * @author Admin
 */
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
    public Usuario findByUsername(String username);
}
