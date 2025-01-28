package be.bstorm;

import be.bstorm.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemoJPA");

        try(EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();

            Player p = new Player("Toto");
            Achievement a = new Achievement("Truc");

            em.persist(p);
            em.persist(a);

            PlayerAchivement pa = new PlayerAchivement(p,a, LocalDateTime.now());

            em.persist(pa);

            em.getTransaction().commit();
        }

    }
}
