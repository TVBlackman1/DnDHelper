package mypackage.Races;

import mypackage.Player;
import mypackage.properties.Ability;

public class MountainDwarf extends Dwarf {
    public MountainDwarf(Player _player) {
        super(_player);
        name = "Горный дварф";
        player.abilities[Ability.Strength.ordinal()] += 2;
        player.features.put("Владение доспехами дварфов", "Вы владеете " +
                "лёгкими и средними доспехами."
        );
    }
}
