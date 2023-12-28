/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaSecurity.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import pruebaSecurity.demo.servicios.UsuarioServicio;

/**
 *
 * @author Admin
 */
@Configuration
public class SecurityConfig {
    @Autowired
    private final UsuarioServicio uS;

    public SecurityConfig(UsuarioServicio uS) {
        this.uS = uS;
    }
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http.formLogin(Customizer.withDefaults())
                .authorizeHttpRequests(req -> req
                                .requestMatchers("/login/**").permitAll()
                                .requestMatchers("/admin/**").hasAnyAuthority("ADMIN")
                                .requestMatchers("/visitante/**").hasAnyAuthority("ADMIN", "USER")
                                .anyRequest().authenticated())
                .userDetailsService(uS).build();
    }
}
