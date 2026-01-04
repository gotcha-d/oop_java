package org.example.trump;


import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand = new ArrayList<>();

    /**
     * カードを手札に加える
     * @param card 追加するカード
     */
    public void add(Card card) {
        hand.add(card);
    }

    /**
     * カードを引く
     * @param position カードの位置
     * @return Card
     */
    public Card pickCard(int position) {
        if (!validPosition(position)) {
            return null;
        }
        return hand.remove(position);
    }

    private boolean validPosition(int position) {
        return 0 <= position && position < hand.size();
    }

    /**
     * カードを見る
     * @param position
     * @return
     */
    public Card lookCard(int position) {
        if (!validPosition(position)) {
            return null;
        }
        return hand.get(position);
    }
    
    /**
     * 手札をシャッフルする
     * ランダムな位置からカードを引き、一番最後に追加する操作を
     */
    public void shuffle() {
        int handSize = hand.size();
        int pos;

        for (int count = 0; count < handSize * 2; count++){
            pos = (int) (Math.random() * handSize);
            Card pickedCard = hand.remove(pos);
            hand.add(pickedCard); // this.hand.addとするのと結果は同じ？
        }
    }

    /**
     * 枚数を数える
     * @return 手札の枚数
     */
    public int getCardCount() {
        return hand.size();
    }

    @Override
    public String toString() {
        StringBuffer string = new StringBuffer();

        int handSize = hand.size();
        if (handSize < 1) {
            return string.toString();
        }

        for (int i = 0; i < handSize; i++) {
            Card card = hand.get(i);
            string.append(card);
            string.append(" ");
        }
        return string.toString();
    }

}
