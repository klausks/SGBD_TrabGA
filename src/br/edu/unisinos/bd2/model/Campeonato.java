package br.edu.unisinos.bd2.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Campeonato implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Campeonato")
    @SequenceGenerator(name = "s_Campeonato", sequenceName = "s_Campeonato", allocationSize = 1)
    private Long id;

    @OneToMany(mappedBy = "campeonato")
    private List<Rodada> rodadas = new ArrayList<>();

    @Column(length = 50, nullable = false)
    private String nome;

    @Column(length = 4, nullable = false)
    private int ano;

    @Column(length = 2, nullable = false)
    private int nroClubes;

    public Campeonato(String nome,  int ano, int nroClubes){
        this.nome = nome;
        this.ano = ano;
        this.nroClubes = nroClubes;
    }

    @Override
    public String toString() {
        String str = "Campeonato: %s, criado em %d".format(this.nome, this.ano);
        return str;
    }


}
