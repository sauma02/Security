package pruebaSecurity.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import pruebaSecurity.demo.entidades.Roles;
import pruebaSecurity.demo.entidades.Usuario;
import pruebaSecurity.demo.repositorios.RolesRepositorio;
import pruebaSecurity.demo.repositorios.UsuarioRepositorio;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
        
       
        
        
}
