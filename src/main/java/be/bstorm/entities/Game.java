package be.bstorm.entities;

import jakarta.persistence.*;

@Entity
public class Game {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Player player1;
    @ManyToOne
    private Player player2;

    private String result;
}
