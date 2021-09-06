package br.edu.unisinos.bd2.model;

import lombok.Getter;
import lombok.NonNull;
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
public class ClubeJogador implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_ClubeTecnico")
    @SequenceGenerator(name = "s_ClubeTecnico", sequenceName = "s_ClubeTecnico", allocationSize = 1)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_clube", foreignKey = @ForeignKey(name = "fk_idClube"))
    @NonNull
    private Clube clube;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_jogador", foreignKey = @ForeignKey(name = "fk_idJogador"))
    @NonNull
    private Jogador jogador;

}
