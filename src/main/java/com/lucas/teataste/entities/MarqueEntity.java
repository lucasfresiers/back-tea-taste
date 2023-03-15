package com.lucas.teataste.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Entity
@Getter
@Data
@Table(name="t_marque")
public class MarqueEntity {

    @Id
    private Long id;
    private String nom;
}
