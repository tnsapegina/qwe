package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human(name: "Ivan");
        Human human2 = new Human(name: "Petr");
        market.acceptToMarket(human1);
        market.update();
    }
}
