/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaSecurity.demo.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.context.annotation.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author Admin
 */
@Entity

public class Usuario implements UserDetails {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="Username")
    private String username;
    @Column(name="Contrasenia")
    private String password;
    //Se pone el fetch eager para que los datos de carguen de inmediato en la base de datos
    @OneToMany(fetch=FetchType.EAGER)
    private List<Roles> listaRol;

    public Usuario() {
    }

    public Usuario(Integer id, String username, String password, List<Roles> listaRol) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.listaRol = listaRol;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Roles> getListaRol() {
        return listaRol;
    }

    public void setListaRol(List<Roles> listaRol) {
        this.listaRol = listaRol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", usuario=" + username + ", password=" + password + ", listaRol=" + listaRol + '}';
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorityList = new ArrayList<>();
        for(Roles rol : listaRol){
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(rol.getNombre());
            authorityList.add(authority);
            
        }
        return authorityList;
        
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    
    
}
