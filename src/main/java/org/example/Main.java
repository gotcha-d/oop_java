package org.example;

import org.example.janken.Judge;
import org.example.janken.players.Player;
import org.example.janken.tactics.CyclicTactics;
import org.example.janken.tactics.RandomTactics;
import org.example.janken.tactics.Tactics;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Judge judge = new Judge();

        Tactics tactics = new RandomTactics();
        Player yamada = new Player("山田"); // 山田はランダムに手を出す
        yamada.setTactics(tactics);

        Player you = new Player("gotcha"); // 村田はグーだけを出す
        Tactics anotherTactics = new CyclicTactics();
        you.setTactics(anotherTactics);
        judge.startJanken(yamada, you);
    }
}