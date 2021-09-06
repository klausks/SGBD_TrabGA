package br.edu.unisinos.bd2.model;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@RequiredArgsConstructor
public class Posicao implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Posicao")
    @SequenceGenerator(name = "s_Posicao", sequenceName = "s_Posicao", allocationSize = 1)
    private long id;

    @OneToMany(mappedBy = "posicao")
    private List<Jogador> jogadores;

    @Column(length = 50)
    @NonNull
    private String nome;

}