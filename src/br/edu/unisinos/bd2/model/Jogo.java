package br.edu.unisinos.bd2.model;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@RequiredArgsConstructor
public class Jogo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Jogo")
    @SequenceGenerator(name = "s_Jogo", sequenceName = "s_Jogo", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_campeonato", foreignKey = @ForeignKey(name = "fkIdCampeonato"))
    @NonNull
    private Campeonato campeonato;

    @ManyToOne
    @JoinColumn(name = "id_rodada", foreignKey = @ForeignKey(name = "fkIdRodada"))
    @NonNull
    private Rodada rodada;

    @ManyToOne
    @JoinColumn(name = "id_clube1", foreignKey = @ForeignKey(name = "fkIdClube1"))
    @NonNull
    private Clube clube1;

    @ManyToOne
    @JoinColumn(name = "id_clube2", foreignKey = @ForeignKey(name = "fkIdClube2"))
    @NonNull
    private Clube clube2;

    @Column(length = 2)
    private Integer clube1Gol;

    @Column(length = 2)
    private Integer clube2Gol;

    @Column(length = 2)
    private Integer clube1Amarelo;

    @Column(length = 2)
    private Integer clube2Amarelo;

    @Column(length = 2)
    private Integer clube1Vermelho;

    @Column(length = 2)
    private Integer clube2Vermelho;

    @Column(length = 1)
    private Integer clube1Ponto;

    @Column(length = 1)
    private Integer clube2Ponto;

    public Jogo(Campeonato campeonato,
                Rodada rodada,
                Clube clube1,
                Clube clube2,
                int clube1Amarelo,
                int clube2Amarelo,
                int clube1Gol,
                int clube2Gol,
                int clube1Vermelho,
                int clube2Vermelho,
                int clube1Ponto,
                int clube2Ponto) {
        this.campeonato = campeonato;
        this.rodada = rodada;
        this.clube1 = clube1;
        this.clube2 = clube2;
        this.clube1Amarelo = clube1Amarelo;
        this.clube2Amarelo = clube2Amarelo;
        this.clube1Gol = clube1Gol;
        this.clube2Gol = clube2Gol;
        this.clube1Vermelho = clube1Vermelho;
        this.clube2Vermelho = clube2Vermelho;
        this.clube1Ponto = clube1Ponto;
        this.clube2Ponto = clube2Ponto;
    }
}


