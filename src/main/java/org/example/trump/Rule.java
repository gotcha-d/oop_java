package org.example.trump;

import org.example.oldMade.card.Hand;
import org.example.oldMade.card.Table;

public interface Rule {
    /**
     * テーブルにおけるカードを探す
     * 現在の手札とテーブルから、出しうるカードの組み合わせをみつける。
     * @param hand 手札
     * @param table テーブル
     * @return 見つかったカードの組み合わせ。見つからなかった場合はnullを返す
     */
    public Card[] findCandidate(Hand hand, Table table);
}
