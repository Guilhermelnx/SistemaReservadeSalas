package br.edu.unifan.sisreserva.domain.repository;

import br.edu.unifan.sisreserva.domain.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {

    // A mágica acontece aqui: uma Query customizada em JPQL
    @Query("SELECT COUNT(r) > 0 FROM Reserva r " +
            "WHERE r.espaco.id = :espacoId " +
            "AND r.dataHoraInicio < :dataFim " +
            "AND r.dataHoraFim > :dataInicio " +
            "AND r.status != 'CANCELADA'")
    boolean existeConflitoDeHorario(
            @Param("espacoId") Long espacoId,
            @Param("dataInicio") LocalDateTime dataInicio,
            @Param("dataFim") LocalDateTime dataFim
    );
}