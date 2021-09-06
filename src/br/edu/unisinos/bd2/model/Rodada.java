package br.edu.unisinos.bd2.model;

import lombok.Getter;
import lombok.NonNull;
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
    @JoinColumn(name = "id_campeonato", foreignKey = @ForeignKey(name = "fk_idCampeonato"))
    @NonNull
    private Campeonato campeonato;

    @Column(length = 2, name = "id_rodada")
    @NonNull
    private int idRodada;

    @Column(length = 2)
    private int totalJogos;

    @Column(length = 3)
    private int totalAmarelos;

    @Column(length = 3)
    private int totalVermelhos;

    @Column(length = 3)
    private int totalGols;

    public Rodada(Campeonato campeonato, int idRodada, int totalJogos, int totalAmarelos, int totalVermelhos, int totalGols){
        this.campeonato = campeonato;
        this.idRodada = idRodada;
        this.totalJogos = totalJogos;
        this.totalAmarelos = totalAmarelos;
        this.totalVermelhos = totalVermelhos;
        this.totalGols = totalGols;
    }

}