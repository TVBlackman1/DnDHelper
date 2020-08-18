package mypackage;

import mypackage.Races.Dwarf;
import mypackage.properties.Ability;

import java.util.ArrayList;
import java.util.HashMap;

public class Class extends Player {
    protected String name;
    protected short level;
    protected short hitDice;
    protected short hitDiceStandard;
    protected Player player;
    protected short preparedSpells;
    protected short primarySpells;
    protected ArrayList<String> preparedSpellsList;
    protected ArrayList<String> primarySpellsList;
    protected HashMap<String, Feature> features;
    protected ArrayList<Short> levelsAbilitiesUp;

    public Class(Player _player) {
        player = _player;
        preparedSpellsList = new ArrayList<>();
        primarySpellsList = new ArrayList<>();
        levelsAbilitiesUp = new ArrayList<>();
        features = new HashMap<>();
        level = 1;
        player.hitPointsMax += hitDice + player.getAbility(Ability.Constitution);
    }

    public void levelUp() {
        level++;
        player.hitPointsMax += hitDiceStandard + player.getAbility(Ability.Constitution);
    }
    public class Feature {
        private final String name;
        private final String description;
        public Feature(String _name, String _description) {
            name = _name;
            description = _description; }
    }

    protected void appendFeature(String name, String description) {
        features.put(name, new Feature(name, description));
    }

    /**
     * Функция для увеличения характеристик или добавления черты с заданного уровня
     *
    * */
    protected void abilitiesUp() {

    }
}
