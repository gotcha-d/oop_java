package org.example;

public class Player {

    public static final int STONE = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    private String name;
    private int winCount = 0;

    public Player(String name) {
        this.name = name;
    }

    public int hand() {
        double randomNum = 0;
        // プレイヤー1の手
        int hand = 0;
        randomNum = Math.random() * 3;
        if (randomNum < 1) {
            hand = STONE;
        } else if (randomNum < 2) {
            hand = SCISSORS;
        } else if (randomNum < 3) {
            hand = PAPER;
        }
        return hand;
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
