package br.edu.unifan.sisreserva.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // A data e hora em que a reserva vai acontecer
    @Column(nullable = false)
    private LocalDateTime dataHoraInicio;

    @Column(nullable = false)
    private LocalDateTime dataHoraFim;

    // Status da reserva (ex: "PENDENTE", "CONFIRMADA", "CANCELADA")
    @Column(nullable = false, length = 20)
    private String status;

    // --- AQUI ESTÃO OS RELACIONAMENTOS (CHAVES ESTRANGEIRAS) ---

    // Várias reservas podem pertencer a UM usuário
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false) // Nome da coluna da chave estrangeira no banco
    private Usuario usuario;

    // Várias reservas podem ser feitas para UM espaço
    @ManyToOne
    @JoinColumn(name = "espaco_id", nullable = false)
    private Espaco espaco;

}