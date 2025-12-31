package org.example.janken.players;

import org.example.janken.tactics.Tactics;

public class Player {

    public static final int STONE = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    private String name;
    private int winCount = 0;
    private Tactics tactics;

    public Player(String name) {
        this.name = name;
    }

    public void setTactics(Tactics tactics) {
        this.tactics = tactics;
    }

    public int hand() {
        return tactics.readTactics();
    }

    /**
     * 審判から勝敗を聞く
     *
     * @param result true:勝ち, false:負け
     */
    public void notifyResult(boolean result) {
        if (result) {
            winCount++;
        }
    }

    /**
     * 自分の勝った回数を数える
     *
     * @return 勝った回数
     */
    public int getWinCount() {
        return winCount;
    }

    /**
     * 自分の名前を答える
     */
    public String getName() {
        return name;
    }
}
