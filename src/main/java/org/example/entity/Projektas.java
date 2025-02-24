package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Getter
@Setter
@ToString
@Entity
@Table(name = "projektas")
public class Projektas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String pavadinimas;

    @OneToMany(mappedBy = "projektas", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Darbuotojas> darbuotojai;

    public Projektas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }
}
