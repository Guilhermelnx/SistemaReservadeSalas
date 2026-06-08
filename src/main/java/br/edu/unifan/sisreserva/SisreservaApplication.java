package br.edu.unifan.sisreserva;

import br.edu.unifan.sisreserva.domain.model.Usuario;
import br.edu.unifan.sisreserva.domain.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SisreservaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SisreservaApplication.class, args);
	}

}