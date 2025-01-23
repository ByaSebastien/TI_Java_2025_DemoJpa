package be.bstorm;

import be.bstorm.entities.User;
import be.bstorm.enums.UserGender;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemoJPA")){

            try (EntityManager em = emf.createEntityManager()) {

                System.out.println("Connected to database");

                User user = new User(
                        "Sebastien",
                        "Bya",
                        LocalDate.of(1991,3,27),
                        UserGender.MALE
                );

                em.getTransaction().begin();

                em.persist(user);

//                System.out.println(user);

                em.detach(user);

                user.setFirstName("Bambino");
                user.setLastName("De la Vega");

                user = em.merge(user);

                em.remove(user);

//                System.out.println(user);

                em.getTransaction().commit();

                User result = em.find(User.class, 1);

                System.out.println(result);
            }
        }
    }
}
