package com.lucas.teataste.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Entity
@Getter
@Data
@Table(name="t_user")
public class UserEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    private String username;
    private String nom;

    private String prenom;

    private String mail;

    private String password;

}
