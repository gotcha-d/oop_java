package org.example.trump;

/**
 * ジョーカーを表すクラス
 * Cardクラスを継承し、setNumber, setSuiteを使用することでどのようなカードとしても扱うことができる。
 */
public class Joker extends Card {

    public Joker() {
        super(0, 0);
    }

    /**
     * スートを変更する
     * @param suit
     */
    public void setSuit(int suit) {
        this.suit = suit;
    }

    /**
     * 数を変更する
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "JK";
    }
}
