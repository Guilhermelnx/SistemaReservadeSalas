package br.edu.unifan.sisreserva.domain.repository;

import br.edu.unifan.sisreserva.domain.model.Espaco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspacoRepository extends JpaRepository<Espaco, Long> {
}