package be.bstorm.entities;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Musician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 50)
    private String name;

    @ManyToMany
    private final List<Instrument> instruments;

    public Musician() {
        instruments = new ArrayList<>();
    }

    public Musician(String name) {
        this();
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

    public List<Instrument> getInstruments() {
        return List.copyOf(instruments);
    }

    public void addInstrument(Instrument instrument) {
        instruments.add(instrument);
    }

    public void removeInstrument(Instrument instrument) {
        instruments.remove(instrument);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musician musician = (Musician) o;
        return Objects.equals(id, musician.id) && Objects.equals(name, musician.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Musician{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", instruments=" + instruments +
                '}';
    }
}
