package mypackage;

import mypackage.properties.*;

public class Race {
    protected String name;
    protected Player player;
    protected short level;
    protected Size size;

    public Race(Player _player) {
        player = _player;
        level = 1;
    }
    public void levelUp() {
        level++;
    }
}
