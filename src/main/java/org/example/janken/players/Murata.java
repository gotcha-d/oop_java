package org.example.janken.players;

public class Murata extends Player {
    public Murata(String name) {
        super(name);
    }

    public int hand() {
        return STONE;
    }
}
