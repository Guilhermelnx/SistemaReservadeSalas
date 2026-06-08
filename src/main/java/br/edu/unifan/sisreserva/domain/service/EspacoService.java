package br.edu.unifan.sisreserva.domain.service;

import br.edu.unifan.sisreserva.domain.model.Espaco;
import br.edu.unifan.sisreserva.domain.repository.EspacoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspacoService {

    @Autowired
    private EspacoRepository repository;

    public Espaco salvar(Espaco espaco) {
        return repository.save(espaco);
    }

    public List<Espaco> listarTodos() {
        return repository.findAll();
    }
}