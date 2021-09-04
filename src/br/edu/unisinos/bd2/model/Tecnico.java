package br.edu.unisinos.bd2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Tecnico implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Tecnico")
    @SequenceGenerator(name = "s_Tecnico", sequenceName = "s_Tecnico", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @OneToMany(mappedBy = "tecnico")
    private List<ClubeTecnico> clubeTecnicoList;

    public Tecnico(String nome){
        this.nome = nome;
    }
}
