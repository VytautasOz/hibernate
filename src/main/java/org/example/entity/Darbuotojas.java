//package org.example.entity;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@ToString
//@Entity
//@Table(name = "darbuotojas")
//
//public class Darbuotojas {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String vardas;
//    private String pavarde;
//
//    @ManyToOne
//    @JoinColumn(name = "skyrius_id")
//    private Skyrius skyrius;
//
//    @ManyToOne
//    @JoinColumn(name = "projektas_id")  // Foreign key column
//    private Projektas projektas;
//
//    public Darbuotojas(String vardas, String pavarde, Skyrius skyrius, Projektas projektas) {
//        this.vardas = vardas;
//        this.pavarde = pavarde;
//        this.skyrius = skyrius;
//        this.projektas = projektas;
//    }
//}
