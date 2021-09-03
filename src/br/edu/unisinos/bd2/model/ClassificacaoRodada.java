package br.edu.unisinos.bd2.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class ClassificacaoRodada implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Classificacao")
    @SequenceGenerator(name = "s_Classificacao", sequenceName = "s_Classificacao", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false, name = "id_campeonato", foreignKey = @ForeignKey(name = "fkIdCampeonato"))
    private Campeonato campeonato;

    @ManyToOne
    @JoinColumn(nullable = false, name = "id_rodada", foreignKey = @ForeignKey(name = "fkIdRodada"))
    private Rodada rodada;

    @Column(name="posicao", length = 2, nullable = false)
    private int posicao;

    @ManyToOne
    @JoinColumn(nullable = false, name = "id_clube", foreignKey = @ForeignKey(name = "fkIdClube"))
    private Clube clube;

    @Column(name="totalPontos", length = 3)
    private int totalPontos;

    @Column(name="totalVitorias", length = 2)
    private int totalVitorias;

    @Column(name="totalEmpates", length = 2)
    private int totalEmpates;

    @Column(name="totalDerrotas", length = 2)
    private int totalDerrotas;

    @Column(name="totalGolsPro", length = 3)
    private int totalGolsPro;

    @Column(name="totalGolsContra", length = 3)
    private int totalGolsContra;

}