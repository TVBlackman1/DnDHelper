package mypackage;

import mypackage.properties.*;

public class Race extends Player {
    protected String name;
//    protected Player player;
    public int level;

    public Race() {
        level = 2;
    }
    public void levelUp() {
        level++;
    }


    /**
     * Бафает какую-то характеристику персонажа
     * */
    public void buff(Player player) {

    }
}
