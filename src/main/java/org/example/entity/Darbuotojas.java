package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Darbuotojas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String vardas;
    private String pavarde;

    @ManyToOne
    private Skyrius skyrius;

    @ManyToOne
    private Projektas projektas;

    public Darbuotojas(String vardas, String pavarde, Skyrius skyrius, Projektas projektas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.skyrius = skyrius;
        this.projektas = projektas;
    }
}
