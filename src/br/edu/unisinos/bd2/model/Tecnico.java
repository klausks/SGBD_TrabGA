package br.edu.unisinos.bd2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Tecnico implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Tecnico")
    @SequenceGenerator(name = "s_Tecnico", sequenceName = "s_Tecnico", allocationSize = 1)
    private Long id;

    @OneToMany(mappedBy = "tecnico")
    private List<ClubeTecnico> clubeTecnicoList;
    public Tecnico() {

    }
}
