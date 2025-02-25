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
public class Skyrius {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String pavadinimas;

    @OneToMany(mappedBy = "skyrius", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Darbuotojas> darbuotojai;

    public Skyrius(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }
}
