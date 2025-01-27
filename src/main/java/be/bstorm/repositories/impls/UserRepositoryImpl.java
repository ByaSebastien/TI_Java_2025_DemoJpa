package be.bstorm.repositories.impls;

import be.bstorm.entities.User;
import be.bstorm.repositories.UserRepository;
import jakarta.persistence.EntityManager;

import java.util.List;

public class UserRepositoryImpl extends BaseRepositoryImpl<User,Long> implements UserRepository {


    public UserRepositoryImpl() {
        super(User.class);
    }

    @Override
    public List<User> findAllUser() {
        try(EntityManager em = emf.createEntityManager()){

            return em.createNamedQuery("findAllUser", User.class).getResultList();
        }
    }
}
