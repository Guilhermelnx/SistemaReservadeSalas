package br.edu.unifan.sisreserva.domain.service;

import br.edu.unifan.sisreserva.domain.model.Usuario;
import br.edu.unifan.sisreserva.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    // Lógica para salvar um usuário
    public Usuario salvar(Usuario usuario) {
        // Futuramente, a nossa regra de negócio entra aqui!
        // Exemplo: if (emailJaExiste) { lançar erro; }

        return repository.save(usuario);
    }

    // Lógica para listar os usuários
    public List<Usuario> listarTodos() {
        return repository.findAll();
    }
}