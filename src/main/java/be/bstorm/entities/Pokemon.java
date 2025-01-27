package be.bstorm.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Pokemon {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 50)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    private Trainer trainer;

    public Pokemon() {
    }

    public Pokemon(String name, Trainer trainer) {
        this.name = name;
        this.trainer = trainer;
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

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(id, pokemon.id) && Objects.equals(name, pokemon.name) && Objects.equals(trainer, pokemon.trainer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, trainer);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", trainer=" + trainer +
                '}';
    }
}
