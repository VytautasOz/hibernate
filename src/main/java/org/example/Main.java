package org.example;

import org.example.entity.Comment;
import org.example.entity.Darbuotojas;
import org.example.entity.Projektas;
import org.example.entity.Skyrius;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        try (SessionFactory factory = new Configuration().configure().buildSessionFactory()) {
            try (Session session = factory.openSession()) {
                Transaction tx = session.beginTransaction();

                addTestData(session);

                tx.commit();

            }
        }

    }

    private static void addTestData(Session session) {

        Skyrius skyrius1 = new Skyrius("IT");
        Skyrius skyrius2 = new Skyrius("Finansai");
        Skyrius skyrius3 = new Skyrius("HR");
        Skyrius skyrius4 = new Skyrius("Marketingas");
        Skyrius skyrius5 = new Skyrius("Pardavimai");

        session.persist(skyrius1);
        session.persist(skyrius2);
        session.persist(skyrius3);
        session.persist(skyrius4);
        session.persist(skyrius5);


        Projektas projektas1 = new Projektas("Aplikacija");
        Projektas projektas2 = new Projektas("Zaidimas");
        Projektas projektas3 = new Projektas("Buhalterine sistema");
        Projektas projektas4 = new Projektas("SEO");
        Projektas projektas5 = new Projektas("Monitoringas");

        session.persist(projektas1);
        session.persist(projektas2);
        session.persist(projektas3);
        session.persist(projektas4);
        session.persist(projektas5);


        session.persist(new Darbuotojas("Vytas", "O", skyrius1, projektas1));
        session.persist(new Darbuotojas("Diana", "Z", skyrius2, projektas2));
        session.persist(new Darbuotojas("Alfonsas", "B", skyrius3, projektas3));
        session.persist(new Darbuotojas("Jokubas", "AS", skyrius4, projektas4));
        session.persist(new Darbuotojas("Egle", "Ku", skyrius5, projektas5));
    }
}


