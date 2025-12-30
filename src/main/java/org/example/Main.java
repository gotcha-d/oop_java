package org.example;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Judge judge = new Judge();
        Player yamada = new Yamada("山田"); // 山田はパーしか出さない
        Player murata = new Murata("村田"); // 村田はグーしか出さない
        judge.startJanken(yamada, murata);
    }
}