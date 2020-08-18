package mypackage;

import mypackage.properties.Ability;

import java.util.HashMap;

public class StartAbilities extends Player{
    static HashMap<Integer, Integer> abilities2Points = new HashMap<Integer, Integer>();
    static int points = 0;
    static int pointsMax = 27;

    static void Start() {
        abilities2Points.put(8, 0);
        abilities2Points.put(9, 1);
        abilities2Points.put(10, 2);
        abilities2Points.put(11, 3);
        abilities2Points.put(12, 4);
        abilities2Points.put(13, 5);
        abilities2Points.put(14, 7);
        abilities2Points.put(15, 9);
    }

//    static void editAbility(Player player, Ability ability, int value) {
//        points -= abilities2Points.get(player.abilities[ability.ordinal()]);
//        points += abilities2Points.get(value);
//        player.abilities[ability.ordinal()] = value;
//    }

}
