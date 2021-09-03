package br.edu.unisinos.bd2.model;

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
public class Jogo implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Jogo")
    @SequenceGenerator(name = "s_Jogo", sequenceName = "s_Jogo", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false, name = "id_campeonato", foreignKey = @ForeignKey(name = "fkIdCampeonato"))
    private Campeonato campeonato;
    
    @ManyToOne
    @JoinColumn(nullable = false, name = "id_rodada", foreignKey = @ForeignKey(name = "fkIdRodada"))
    private Rodada rodada;
    
    @ManyToOne
    @JoinColumn(nullable = false, name = "id_clube1", foreignKey = @ForeignKey(name = "fkIdClube1"))
    private Clube clube1;

    @ManyToOne
    @JoinColumn(nullable = false, name = "id_clube2", foreignKey = @ForeignKey(name = "fkIdClube2"))
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

    public Jogo(Campeonato campeonato, Rodada rodada, Clube clube1, Clube clube2) {
    	this.campeonato = campeonato;
    	this.rodada = rodada;
    	this.clube1 = clube1;
    	this.clube2 = clube2;
    }
}


