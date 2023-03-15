package com.lucas.teataste.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Entity
@Getter
@Data
@Table(name="t_variete")
public class VarieteEntity {

    @Id
    private Long id;
    private String nom;
}
