package com.lucas.teataste.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Entity
@Getter
@Data
@Table(name="t_degustation")
public class DegustationEntity {

    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private MarqueEntity marque;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private VarieteEntity variete;
    private String nom;
    private String commentaire;
    private String score;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private PaysEntity pays;
}
