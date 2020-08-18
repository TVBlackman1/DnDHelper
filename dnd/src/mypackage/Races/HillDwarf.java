package mypackage.Races;

import mypackage.Player;
import mypackage.properties.Ability;

public class HillDwarf extends Dwarf {
    public HillDwarf(Player _player) {
        super(_player);
        name = "Холмовой дварф";
        abilities.put(Ability.Wisdom, 1);
        raceFeatures.put("Дварфская выдержка", "Максимальное значение " +
                "ваших хитов увеличивается на 1, и вы получаете 1 дополнительный " +
                "хит с каждым новым уровнем.");
    }

    @Override
    public int getHitPointsMax() {
        return level;
    }

    @Override
    public void levelUp() {
        super.levelUp();
//        player.hitPointsMax += 1;
    }

    @Override
    public void buff(Player player) {
        super.buff(player);
        hitPoints = player.level;
    }
}
