package br.edu.unisinos.bd2.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Rodada implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Rodada")
    @SequenceGenerator(name = "s_Rodada", sequenceName = "s_Rodada", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "campeonato", foreignKey = @ForeignKey(name = "fk_idCampeonato"))
    @Column(nullable = false, unique = true)
    private Campeonato campeonato;

    @Column(length = 2, nullable = false)
    private int idRodada;    
    
    @Column(length = 2)
    private int totalJogos;

    @Column(length = 3)
    private int totalAmarelos;

    @Column(length = 3)
    private int totalVermelhos;

    @Column(length = 3)
    private int totalGols;

    public Rodada(Campeonato campeonato, int idRodada) {
        this.campeonato = campeonato;
        this.idRodada = idRodada;
    }
}