package org.example.oldMade.card;

import java.util.ArrayList;

public class Master {

    private ArrayList<Player> players = new ArrayList<>();
    /**
     * ゲームに参加するプレイヤーを登録する
     * @param player 参加するプレイヤー
     */
    public void registerPlayer(Player player) {
        this.players.add(player);
    }

    /**
     * ゲームの準備をする
     * @param cards トランプの進行役の手札として渡すカード群
     */
    public void prepareGame(Hand cards) {
        System.out.println("【カードを配ります】");

        cards.shuffle();
        int numberOfCards = cards.getCardCount();
        int numberOfPlayers = players.size();

        for (int i = 0; i < numberOfCards; i++) {
            // カードから1枚引き、プレイヤーに順番に配る
            Card card = cards.pickCard();
            Player player = players.get(i % numberOfPlayers);
            player.receiveCard(card);
        }
    }

    public void startGame() {
        System.out.println("\n【ババ抜きを開始します】");
        for (int count = 0; players.size() > 1; count++) {
            int playerIndex = count % players.size();
            Player player = players.get(playerIndex);
            int nextPlayerIndex = (count + 1) % players.size();
            Player nextPlayer = players.get(nextPlayerIndex);
            // プレイヤーを指名する
            System.out.println(player + "さんの番です");
            player.play(nextPlayer);
        }

        System.out.println("【ババ抜きを終了しました】");
    }

    public void declareWin(Player winner) {
        System.out.println(winner + "さんが上がりました");
        // 上がったプレイヤーをリストから探す
        players.remove(winner);
        if (players.size() == 1) {
            Player loser = players.getFirst();
            System.out.println(loser + "さんの負けです");
        }
    }
}
