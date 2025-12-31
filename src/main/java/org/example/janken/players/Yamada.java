package org.example.janken.players;

public class Yamada extends Player {
    public Yamada(String name) {
        super(name);
    }

    public int hand() {
        return PAPER;
    }
}
