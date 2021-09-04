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
    @JoinColumn(nullable = false, name = "id_posicao", foreignKey = @ForeignKey(name = "fkIdPosicao"))
    private Posicao posicao;

    @Column(length = 50, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "jogador")
    List<ClubeJogador> clubeJogadorList;

    public Jogador(String nome, Posicao p) {
        this.nome = nome;
        this.posicao = p;
    }
}
