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
}