package org.example.janken.tactics;

import org.example.janken.players.Player;

public class RandomTactics implements Tactics {
    @Override
    public int readTactics() {
        double randomNum = 0;
        // プレイヤー1の手
        int hand = 0;
        randomNum = Math.random() * 3;
        if (randomNum < 1) {
            hand = Player.STONE;
        } else if (randomNum < 2) {
            hand = Player.SCISSORS;
        } else if (randomNum < 3) {
            hand = Player.PAPER;
        }
        return hand;
    }
}
