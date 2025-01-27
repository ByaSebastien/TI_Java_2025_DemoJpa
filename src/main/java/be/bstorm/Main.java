package be.bstorm;

import be.bstorm.entities.Address;
import be.bstorm.entities.Product;
import be.bstorm.entities.Stock;
import be.bstorm.entities.User;
import be.bstorm.enums.UserGender;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemoJPA");

        try(EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();

            User user = new User("a","b", LocalDate.now(), UserGender.MALE);
            user.setAddress(new Address("a","b","c"));

            em.persist(user);

            em.getTransaction().commit();
        }

    }
}
