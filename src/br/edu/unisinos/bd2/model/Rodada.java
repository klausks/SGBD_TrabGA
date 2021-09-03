package br.edu.unisinos.bd2.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Rodada implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Rodada")
    @SequenceGenerator(name = "s_Rodada", sequenceName = "s_Rodada", allocationSize = 1)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false, name = "id_campeonato", foreignKey = @ForeignKey(name = "fk_idCampeonato"))
    private Campeonato campeonato;

    @Column(length = 2, nullable = false, name = "id_rodada")
    private int idRodada;

    @Column(length = 2)
    private int totalJogos;

    @Column(length = 3)
    private int totalAmarelos;

    @Column(length = 3)
    private int totalVermelhos;

    @Column(length = 3)
    private int totalGols;

}