package br.edu.unifan.sisreserva.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_espaco")
public class Espaco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Integer capacidade;

    // Essa anotação salva a palavra (ex: "LABORATORIO") no banco, em vez de um número (0, 1, 2)
    @Enumerated(EnumType.STRING)
    private TipoEspaco tipoEspaco;

    // Construtor vazio obrigatório para o JPA
    public Espaco() {
    }

    // --- Getters e Setters ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public TipoEspaco getTipoEspaco() {
        return tipoEspaco;
    }

    public void setTipoEspaco(TipoEspaco tipoEspaco) {
        this.tipoEspaco = tipoEspaco;
    }
}