package br.edu.unifan.sisreserva.controller;

import br.edu.unifan.sisreserva.domain.model.Espaco;
import br.edu.unifan.sisreserva.domain.service.EspacoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/espacos")
public class EspacoController {

    @Autowired
    private EspacoService espacoService;

    @PostMapping
    public Espaco salvar(@RequestBody Espaco espaco) {
        return espacoService.salvar(espaco);
    }

    @GetMapping
    public List<Espaco> listarTodos() {
        return espacoService.listarTodos();
    }
}