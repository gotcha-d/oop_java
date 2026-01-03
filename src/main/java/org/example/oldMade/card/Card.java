package org.example.oldMade.card;

public class Card {

    private int number;
    private int suit;

    public static final int JOKER = 0;
    public static final int SUIT_SPADE = 1;
    public static final int SUIT_DIAMOND = 2;
    public static final int SUIT_CLUB = 3;
    public static final int SUIT_HEART = 4;

    public Card(int suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    /**
     * カードを文字列で表現する
     *
     * @return string
     */
    @Override
    public String toString() {
        StringBuffer string = new StringBuffer();

        if (number == JOKER) {
            string.append("JK");
            return string.toString();
        }

        switch (suit){
            case SUIT_SPADE:
                string.append("S");
                break;
            case SUIT_DIAMOND:
                string.append("D");
                break;
            case SUIT_CLUB:
                string.append("C");
                break;
            case SUIT_HEART:
                string.append("H");
                break;
            default:
                break;
        }

        switch (number) {
            case 1:
                string.append("A");
                break;
            case 10:
                string.append("T");
                break;
            case 11:
                string.append("J");
                break;
            case 12:
                string.append("Q");
                break;
            case 13:
                string.append("K");
                break;
            default:
                string.append(number);
                break;
        }

        return string.toString();
    }
}
