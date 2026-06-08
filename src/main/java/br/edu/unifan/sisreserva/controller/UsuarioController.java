package br.edu.unifan.sisreserva.controller;

import br.edu.unifan.sisreserva.domain.model.Usuario;
import br.edu.unifan.sisreserva.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Rota para listar (GET)
    @GetMapping("/usuarios")
    public List<Usuario> listarTodos() {
        return usuarioService.listarTodos();
    }

    // Rota para criar (POST)
    // O @RequestBody diz ao Spring para pegar o JSON que vamos enviar e transformar em um objeto Usuario
    @PostMapping("/usuarios")
    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);
    }
}