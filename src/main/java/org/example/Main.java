package org.example;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Judge judge = new Judge();
        Player player1 = new Player("たかし");
        Player player2 = new Player("花子");
        judge.startJanken(player1, player2);
    }
}