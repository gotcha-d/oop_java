package org.example;

public class Player {

    public static final int STONE = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    private String name;
    private int winCount = 0;

    public int hand() {
        double randomNum = 0;
        // プレイヤー1の手
        int hand = 0;
        randomNum = Math.random() * 3;
        if (randomNum < 1) {
            hand = STONE;
            System.out.println("プレイヤー1の手:グー");
        } else if (randomNum < 2) {
            hand = SCISSORS;
            System.out.println("プレイヤー1の手:チョキ");
        } else if (randomNum < 3) {
            hand = PAPER;
            System.out.println("プレイヤー1の手:パー");
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
}
