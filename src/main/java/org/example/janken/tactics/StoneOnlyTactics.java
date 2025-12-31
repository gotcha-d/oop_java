package org.example.janken.tactics;

import org.example.janken.players.Player;

public class StoneOnlyTactics implements Tactics {
    @Override
    public int readTactics() {
        return Player.STONE;
    }
}
