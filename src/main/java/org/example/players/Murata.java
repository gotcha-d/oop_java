package org.example.players;

public class Murata extends Player {
    public Murata(String name) {
        super(name);
    }

    public int hand() {
        return STONE;
    }
}
