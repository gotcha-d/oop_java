package org.example;

import org.example.players.Player;

public class Judge {
    /**
     * じゃんけんを開始する
     */
    public void startJanken(Player player1, Player player2) {

        System.out.println("【ジャンケン開始】\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("【ジャンケン" + i +"回戦】\n");
            Player winner = judgeJanken(player1, player2);
            if (winner != null) {
                System.out.println("\n" + winner.getName() + "が勝ちました!");
                winner.notifyResult(true);
            }
        }
        System.out.println("【ジャンケン終了】\n");

        Player finalWinner = judgeFinalWinner(player1, player2);
        System.out.println(player1.getWinCount() + "対" + player2.getWinCount() + "で");
        if (finalWinner != null) {
            System.out.println(finalWinner.getName() + "の勝ちです!\n");
        } else {
            System.out.println("引き分けです!\n");
        }
    }

    /**
     * じゃんけんの勝者を判定する
     *
     * @param player1
     * @param player2
     * @return winner 勝ったプレイヤー。引き分けの場合はnull
     */
    private Player judgeJanken(Player player1, Player player2) {
        Player winner = null;

        int player1Hand = player1.hand();
        int player2Hand = player2.hand();

        printHand(player1Hand);
        System.out.println(" .vs ");
        printHand(player2Hand);
        System.out.println("\n");

        if ((player1Hand == Player.STONE && player2Hand == Player.SCISSORS)
                || (player1Hand == Player.SCISSORS && player2Hand == Player.PAPER)
                || (player1Hand == Player.PAPER && player2Hand == Player.STONE)) {
            winner = player1;
        } else if ((player1Hand == Player.SCISSORS && player2Hand == Player.STONE)
                || (player1Hand == Player.PAPER && player2Hand == Player.SCISSORS)
                || (player1Hand == Player.STONE && player2Hand == Player.PAPER)) {
            winner = player2;
        }

        return winner;
    }

    /**
     * 最終的な勝者を判定する
     *
     * @param player1
     * @param player2
     * return 勝ったプレイヤー。引き分けの場合はnull
     */
    private Player judgeFinalWinner(Player player1, Player player2) {
        Player winner = null;

        int player1WinCount = player1.getWinCount();
        int player2WinCount = player2.getWinCount();

        if (player1WinCount > player2WinCount) {
            winner = player1;
        } else if (player1WinCount < player2WinCount) {
            winner = player2;
        }

        return winner;
    }

     private void printHand(int hand) {
        switch (hand) {
            case Player.STONE:
                System.out.println("グー");
                break;
            case Player.SCISSORS:
                System.out.println("チョキ");
                break;
            case Player.PAPER:
                System.out.println("パー");
                break;
            default:
                break;
        }
     }
}
