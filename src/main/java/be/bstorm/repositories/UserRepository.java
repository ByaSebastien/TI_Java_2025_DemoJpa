package be.bstorm.repositories;

import be.bstorm.entities.User;

import java.util.List;

public interface UserRepository extends BaseRepository<User, Long> {

    List<User> findAllUser();
}
