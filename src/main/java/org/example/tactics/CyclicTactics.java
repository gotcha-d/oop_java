package org.example.tactics;

import org.example.players.Player;

import java.util.*;

public class CyclicTactics implements Tactics {
    // 手の一覧
    private ArrayList<Integer> hands = new ArrayList<Integer>() {
        {
            add(Player.STONE);
            add(Player.SCISSORS);
            add(Player.PAPER);
        }
    };
    private Iterator<Integer> iterator;

    public CyclicTactics() {
        // インタスンス生成時点でイテレータを初期化し、要素を初期位置に合わせる
        iterator = hands.iterator();
    }

    @Override
    public int readTactics() {
        int hand = 0;
        if (iterator.hasNext()) {
            hand =  (int) iterator.next();
        } else {
            // 最後までイテレーション済みの場合は、イテレータを初期化する
            iterator = hands.iterator();
            hand = (int) iterator.next();
        }
        return hand;
    }
}
