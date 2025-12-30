package org.example.tactics;

public interface Tactics {
    /**
     * 戦略を読み、ジャンケンの手を得る
     * グー・チョキ・パーのいずれかを返す
     *
     * @return ジャンケンの手
     */
    public int readTactics();
}
