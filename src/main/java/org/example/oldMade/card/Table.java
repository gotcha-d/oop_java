package org.example.oldMade.card;

import java.util.ArrayList;

/**
 * テーブルを表すクラス
 */
public class Table {
    // 捨てられたカードを保持するためのリスト
    private ArrayList disposedCards = new ArrayList();

    /**
     * カードを捨てる
     * @param card 捨てるカードの配列
     */
    public void disposeCard(Card card[]) {
        for (int i = 0; i < card.length; i++) {
            System.out.println(card[i] + " ");
        }
        disposedCards.add(card);
        System.out.println("を捨てました。");
    }
}
