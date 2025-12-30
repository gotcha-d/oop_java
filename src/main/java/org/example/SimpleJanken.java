package org.example;

public class SimpleJanken {

    public static final int STONE = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    public void main() {
        System.out.println("【ジャンケン開始】\n");

        // 各プレイヤーの勝ち数
        int player1WinCount = 0;
        int player2WinCount = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("【ジャンケン" + i +"回戦】\n");
            // 乱数格納変数
            double randomNum = 0;

            // プレイヤー1の手
            int player1Hand = 0;
            randomNum = Math.random() * 3;
            if (randomNum < 1) {
                player1Hand = STONE;
                System.out.println("プレイヤー1の手:グー");
            } else if (randomNum < 2) {
                player1Hand = SCISSORS;
                System.out.println("プレイヤー1の手:チョキ");
            } else if (randomNum < 3) {
                player1Hand = PAPER;
                System.out.println("プレイヤー1の手:パー");
            }

            // プレイヤー2の手
            int player2Hand = 0;
            randomNum = Math.random() * 3;
            if (randomNum < 1) {
                player2Hand = STONE;
                System.out.println("プレイヤー2の手:グー");
            } else if (randomNum < 2) {
                player2Hand = SCISSORS;
                System.out.println("プレイヤー2の手:チョキ");
            } else if (randomNum < 3) {
                player2Hand = PAPER;
                System.out.println("プレイヤー2の手:パー");
            }

            if ((player1Hand == STONE && player2Hand == SCISSORS)
            || (player1Hand == SCISSORS && player2Hand == PAPER)
            || (player1Hand == PAPER && player2Hand == STONE)) {
                player1WinCount++;
                System.out.println("\nプレイヤー1が勝ちました!\n");
            } else if ((player1Hand == SCISSORS && player2Hand == STONE)
            || (player1Hand == PAPER && player2Hand == SCISSORS)
            || (player1Hand == STONE && player2Hand == PAPER)) {
                player2WinCount++;
                System.out.println("\nプレイヤー2が勝ちました!\n");
            } else {
                System.out.println("\n引き分けです!\n");
            }
        }

        System.out.println("【ジャンケン終了】\n");

        if (player1WinCount > player2WinCount) {
            System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー1の勝ちです!\n");
        } else if (player1WinCount < player2WinCount) {
            System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー2の勝ちです!\n");
        } else {
            System.out.println(player1WinCount + "対" + player2WinCount + "で引き分けです!\n");
        }

    }
}
