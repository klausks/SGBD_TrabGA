package br.edu.unisinos.bd2.model;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@RequiredArgsConstructor
public class Jogador implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Jogador")
    @SequenceGenerator(name = "s_Jogador", sequenceName = "s_Jogador", allocationSize = 1)
    private Long id;

    @Column(length = 50)
    @NonNull
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_posicao", foreignKey = @ForeignKey(name = "fkIdPosicao"))
    @NonNull
    private Posicao posicao;


    @OneToMany(mappedBy = "jogador")
    List<ClubeJogador> clubeJogadorList;


}
