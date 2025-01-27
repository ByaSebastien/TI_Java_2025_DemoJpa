package be.bstorm.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Trainer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 50)
    private String name;

//    @OneToMany(mappedBy = "trainer")
//    private List<Pokemon> pokemons;

    public Trainer() {
//        pokemons = new ArrayList<>();
    }

    public Trainer(String name) {
//        this();
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

//    public List<Pokemon> getPokemons() {
//        return List.copyOf(pokemons);
//    }
//
//    public void addPokemon(Pokemon pokemon) {
//        pokemons.add(pokemon);
//        pokemon.setTrainer(this);
//    }
//
//    public void removePokemon(Pokemon pokemon) {
//        pokemons.remove(pokemon);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainer trainer = (Trainer) o;
        return Objects.equals(id, trainer.id) && Objects.equals(name, trainer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
