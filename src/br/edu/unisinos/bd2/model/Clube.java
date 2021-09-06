package br.edu.unisinos.bd2.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Clube implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Clube")
    @SequenceGenerator(name = "s_Clube", sequenceName = "s_Clube", allocationSize = 1)
    private Long id;

    @Column(length = 50)
    @NonNull
    private String nome;

    @OneToMany(mappedBy = "clube")
    private List<ClubeTecnico> clubeTecnicos;

    @OneToMany(mappedBy = "clube")
    private List<ClubeJogador> clubeJogadorList;

    @Column(name="dtFundacao")
    @NonNull
    private Date dataFundacao;


}
