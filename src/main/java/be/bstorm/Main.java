package be.bstorm;

import be.bstorm.entities.Product;
import be.bstorm.entities.Stock;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemoJPA");

        try(EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();

            Product product = new Product("DMC");
            Stock stock = new Stock(10,product);

            em.persist(stock);

            em.getTransaction().commit();
        }

    }
}
