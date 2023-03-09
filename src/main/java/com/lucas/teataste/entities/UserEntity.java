package com.lucas.teataste.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Entity
@Getter
@Data
@Table(name="t_user")
public class UserEntity {

    @Id
    private Long id;
    private String username;
    private String nom;

    private String prenom;

    private String mail;

    private String password;

}
