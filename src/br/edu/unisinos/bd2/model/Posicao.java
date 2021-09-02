package br.edu.unisinos.bd2.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Posicao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Posicao")
    @SequenceGenerator(name = "s_Posicao", sequenceName = "s_Posicao", allocationSize = 1)
    private Long id;

    //TODO: Não entendi pq tem essa lista aqui, penso que a classe Jogador que deveria ter o relacionamento com a Posição (Veigal)
    @OneToMany(mappedBy = "posicao")
    private List<Jogador> jogadores;

    @Column(length = 50, nullable = false)
    private String nome;

    public Posicao() {

    }
}
