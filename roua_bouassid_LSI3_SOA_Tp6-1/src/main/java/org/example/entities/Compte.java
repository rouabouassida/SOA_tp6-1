package org.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString

public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column
    Long Id;
    @Column
    double Solde;
    @Column
    Date DateCreation;
    @Column
    TypeCompte Type;
    @Column
    EtatCompte Etat;

}