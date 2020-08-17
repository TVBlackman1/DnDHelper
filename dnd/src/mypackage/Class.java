package mypackage;

public class Class {
    protected String name;
    protected short level;
    protected short hitDice;
    protected Player player;

    public Class(Player _player) {
        player = _player;
        level = 1;
    }

    public void levelUp() {
        level++;

    }
}
