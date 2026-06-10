package br.edu.unifan.sisreserva.domain.service;

import br.edu.unifan.sisreserva.domain.model.Reserva;
import br.edu.unifan.sisreserva.domain.model.StatusReserva;
import br.edu.unifan.sisreserva.domain.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository repository;

    public Reserva salvar(Reserva reserva) {
        // Usa a sua query genial da Issue 22 para verificar conflitos
        boolean conflito = repository.existeConflitoDeHorario(
                reserva.getEspaco().getId(),
                reserva.getDataHoraInicio(),
                reserva.getDataHoraFim()
        );

        if (conflito) {
            throw new RuntimeException("Operação negada: O espaço já está reservado neste horário!");
        }

        // Se passar direto pela trava, marcamos como CONFIRMADA e salvamos
        reserva.setStatus(StatusReserva.CONFIRMADA);
        return repository.save(reserva);
    }
}