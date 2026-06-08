package br.edu.unifan.sisreserva.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // Obrigatório para o JPA/Hibernate
@Entity
@Table(name = "tb_espaco")
public class Espaco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Ex: "Laboratório de Informática 1", "Sala 204", "Auditório Principal"
    @Column(nullable = false, length = 100)
    private String nome;

    // Quantas pessoas cabem no espaço
    @Column(nullable = false)
    private Integer capacidade;

    // Equipamentos disponíveis (Ex: "Projetor, 30 Computadores, Ar condicionado")
    @Column(length = 255)
    private String recursos;

    // Boa prática: campo para podermos desativar uma sala em manutenção sem deletá-la do banco
    @Column(nullable = false)
    private Boolean ativo = true;

}