package be.bstorm.entities;

import jakarta.persistence.Entity;

@Entity
public class BaseEntityChild extends BaseEntity<Long>{

    private String name;

    public BaseEntityChild() {}

    public BaseEntityChild(String name) {
        this.name = name;
    }
}
