package org.example.oldMade.card;

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
     * @return Card
     */
    public Card pickCard() {
        return hand.removeFirst();
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

    /**
     * 同じ数のカードを探す
     * ない場合はnullを返す
     *
     */
    public Card[] findSameNumber() {
        int handSize = hand.size();
        Card[] sameCards = null;

        if (handSize > 0) {
            // 最後に追加されたカード
            int lastAddedNumber = hand.getLast().getNumber();
            // 同じ数字のカードがあるか走査
            for (int i = 0; i < handSize - 1; i++) {
                Card card = hand.get(i);
                if (card.getNumber() == lastAddedNumber) {
                    sameCards = new Card[2];
                    sameCards[0] = hand.removeLast();
                    sameCards[1] = hand.remove(i);
                    break;
                }
            }
        }
        return sameCards;
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
