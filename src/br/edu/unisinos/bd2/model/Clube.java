package br.edu.unisinos.bd2.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Clube implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Clube")
    @SequenceGenerator(name = "s_Clube", sequenceName = "s_Clube", allocationSize = 1)
    private Long id;

    @Column(length = 50, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "clube")
    private List<ClubeTecnico> clubeTecnicos;

    @OneToMany(mappedBy = "clube")
    private List<ClubeJogador> clubeJogadorList;

    public Clube() {

    }
}
