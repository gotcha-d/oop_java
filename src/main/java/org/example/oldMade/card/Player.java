package org.example.oldMade.card;

public class Player {

    private Master master;
    private Table table;
    private Hand myHand = new Hand();
    private String name;

    /**
     * コンストラクタ
     * @param name 名前
     * @param master 進行役
     * @param table テーブル
     */
    public Player(String name, Master master, Table table) {
        this.name = name;
        this.master = master;
        this.table = table;
    }

    /**
     * 順番を指名する
     *
     * @param nextPlayer 次のプレイヤー
     */
    public void play(Player nextPlayer) {
        // 次のプレイヤーに手札を出してもらい、1枚カードを取得する
        Hand hand = nextPlayer.showHand();
        Card pickedCard = hand.pickCard();
        System.out.println(this + ":" + nextPlayer + "さんから" + pickedCard + "を引きました。");

        dealCard(pickedCard);
        if (myHand.getCardCount() == 0) {
            // 上がりを宣言する
            master.declareWin(this);
            return;
        }
        System.out.println(this + ":残りの手札は" + myHand + "です");
    }

    public Hand showHand() {
        if (myHand.getCardCount() == 1) {
            master.declareWin(this);
        }
        // 手札を見せる前にシャッフルする
        myHand.shuffle();
        return myHand;
    }

    /**
     * カードを受け取る
     * @param card 受け取ったカード
     */
    public void receiveCard(Card card) {
        dealCard(card);
    }

    /**
     * カードを自分の手札に加え、同じ数のカードがあったら捨てる
     */
    private void dealCard(Card card) {
        myHand.add(card);
        Card[] sameCards = myHand.findSameNumber();
        if (sameCards != null) {
            // テーブルへカードを捨てる
            System.out.println(this + " ");
            table.disposeCard(sameCards);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
