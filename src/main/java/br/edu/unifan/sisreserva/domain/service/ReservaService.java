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
        boolean conflito = repository.existeConflitoDeHorario(
                reserva.getEspaco().getId(),
                reserva.getDataHoraInicio(),
                reserva.getDataHoraFim()
        );

        if (conflito) {
            throw new RuntimeException("Operação negada: O espaço já está reservado neste horário!");
        }

        reserva.setStatus(StatusReserva.CONFIRMADA);
        return repository.save(reserva);
    }

    // --- NOVO MÉTODO DE CANCELAMENTO ---
    public Reserva cancelar(Long id) {
        // Busca a reserva pelo ID. Se não achar, lança um erro.
        Reserva reserva = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reserva não encontrada!"));

        // Muda o status e salva novamente
        reserva.setStatus(StatusReserva.CANCELADA);
        return repository.save(reserva);
    }
}