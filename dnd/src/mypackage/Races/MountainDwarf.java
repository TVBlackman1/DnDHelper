package mypackage.Races;

import mypackage.Player;
import mypackage.properties.Ability;

public class MountainDwarf extends Dwarf {
    public MountainDwarf(Player _player) {
        super(_player);
        name = "Горный дварф";
        abilities.put(Ability.Strength, 2);
        raceFeatures.put("Владение доспехами дварфов", "Вы владеете " +
                "лёгкими и средними доспехами."
        );
    }
}
