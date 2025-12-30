package org.example.tactics;

import org.example.players.Player;

public class StoneOnlyTactics implements Tactics {
    @Override
    public int readTactics() {
        return Player.STONE;
    }
}
