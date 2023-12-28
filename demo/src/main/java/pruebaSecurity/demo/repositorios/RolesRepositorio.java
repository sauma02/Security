/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pruebaSecurity.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pruebaSecurity.demo.entidades.Roles;

/**
 *
 * @author Admin
 */
@Repository
public interface RolesRepositorio extends JpaRepository<Roles, Integer> {
    
}
