package br.edu.unifan.sisreserva.domain.repository;

import br.edu.unifan.sisreserva.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}