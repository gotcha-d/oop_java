package org.example.trump;

public abstract class Player {
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
     * 実際の処理はサブクラスで定義
     * @param nextPlayer 次のプレイヤー
     */
    public abstract void play(Player nextPlayer);

    /**
     * カードを配る
     * カードを受け取った時の処理を拡張したい場合は、サブクラスでオーバーライドすること
     * @param card 受け取ったカード
     */
    public void receiveCard(Card card) {
        myHand.add(card);
    }

    @Override
    public String toString() {
        return name;
    }

}
