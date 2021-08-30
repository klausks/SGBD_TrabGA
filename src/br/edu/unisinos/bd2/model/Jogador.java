package br.edu.unisinos.bd2.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Jogador implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Jogador")
    @SequenceGenerator(name = "s_Jogador", sequenceName = "s_Jogador", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "posicao", foreignKey = @ForeignKey(name = "fkIdPosicao"))
    @Column(nullable = false)
    private Posicao posicao;

    @Column(length = 50, nullable = false)
    private String nome;

    //TODO: A classe ClubeJogador deveria ter essa relação (Veigal)
    @OneToMany(mappedBy = "jogador")
    List<ClubeJogador> clubeJogadorList;

    public Jogador() {

    }
}