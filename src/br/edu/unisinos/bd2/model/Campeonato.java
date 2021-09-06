package br.edu.unisinos.bd2.model;

import lombok.*;

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

    @Column(length = 50)
    @NonNull
    private String nome;

    @Column(length = 4)
    @NonNull
    private int ano;

    @Column(length = 2)
    @NonNull
    private int nroClubes;



    @Override
    public String toString() {
        String str = "Campeonato: %s, criado em %d".format(this.nome, this.ano);
        return str;
    }


}
