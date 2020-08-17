package mypackage.Races;

import mypackage.Player;
import mypackage.properties.Ability;

public class HillDwarf extends Dwarf {
    public HillDwarf(Player _player) {
        super(_player);
        name = "Холмовой дварф";
        player.abilities[Ability.Wisdom.ordinal()] += 1;
        player.hitPointsMax += 1;
    }

    @Override
    public void levelUp() {
        super.levelUp();
        player.hitPointsMax += 1;
    }
}
