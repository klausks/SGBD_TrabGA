package br.edu.unisinos.bd2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class ClubeTecnico implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "s_ClubeTecnico")
    @SequenceGenerator(name = "s_ClubeTecnico", sequenceName = "s_ClubeTecnico", allocationSize = 1)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_tecnico", foreignKey = @ForeignKey(name = "fk_idTecnico"))
    private Tecnico tecnico;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_clube", foreignKey = @ForeignKey(name = "fk_idClube"))
    private Clube clube;

    public ClubeTecnico() {

    }
}
