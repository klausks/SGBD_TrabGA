package br.edu.unisinos.bd2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class ClubeJogador implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_ClubeTecnico")
    @SequenceGenerator(name = "s_ClubeTecnico", sequenceName = "s_ClubeTecnico", allocationSize = 1)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "clube", foreignKey = @ForeignKey(name = "fk_idClube"))
    private Clube clube;

    @ManyToOne(optional = false)
    @JoinColumn(name = "jogador", foreignKey = @ForeignKey(name = "fk_idJogador"))
    private Jogador Jogador;

    public ClubeJogador() {

    }
}
