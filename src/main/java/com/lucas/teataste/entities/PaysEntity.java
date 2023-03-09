package com.lucas.teataste.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Entity
@Getter
@Data
@Table(name="t_pays")
public class PaysEntity {

    @Id
    private Long id;
    private String nationalite;
    private String libelle;
}
