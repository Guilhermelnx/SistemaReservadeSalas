package br.edu.unifan.sisreserva.controller;

import br.edu.unifan.sisreserva.domain.model.Reserva;
import br.edu.unifan.sisreserva.domain.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService service;

    @PostMapping
    public Reserva salvar(@RequestBody Reserva reserva) {
        return service.salvar(reserva);
    }

    // --- NOVO ENDPOINT DE CANCELAMENTO ---
    // O {id} na URL indica qual reserva queremos cancelar (ex: /reservas/1/cancelar)
    @PutMapping("/{id}/cancelar")
    public Reserva cancelar(@PathVariable Long id) {
        return service.cancelar(id);
    }
}