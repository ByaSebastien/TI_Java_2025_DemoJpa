package be.bstorm.entities;

import jakarta.persistence.*;

@Entity
//@DiscriminatorColumn(name = "tttttt")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Member {

    @Id @GeneratedValue
    private Long id;

    private String name;

    public Member() {}

    public Member(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
