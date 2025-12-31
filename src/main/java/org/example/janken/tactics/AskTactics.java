package org.example.janken.tactics;

import org.example.janken.players.Player;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 標準入力により、ジャンケンの手をユーザに聞くクラス
 */
public class AskTactics implements Tactics {
    @Override
    public int readTactics() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nジャンケンの手を入力してください");
        System.out.println("0:グー");
        System.out.println("1:チョキ");
        System.out.println("2:パー");

        int hand = 0;
        while (true) {
            try {
                String inputStr = br.readLine();
                hand = Integer.parseInt(inputStr);

                if (hand == Player.STONE || hand == Player.SCISSORS || hand == Player.PAPER) {
                    break;
                } else {
                    System.out.println("入力が正しくありません。0~2の整数を入力してください");
                }
            } catch (Exception e) {
                System.out.println("入力が正しくありません。0~2の整数を入力してください");
            }
        }
        return hand;
    }
}
