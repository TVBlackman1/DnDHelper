package mypackage;

import mypackage.properties.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Player {
    public Race race;
    protected Size size;
    public ArrayList<Class> classes;
    public Class mainClass;
    public int level;
    public int hitPoints;
    public int hitPointsMax;
    public int speed;
    public int AC;
    public int initiative;
    //    public final int[] skills;
//    public final int[] savingThrows;
//    public final Boolean[] damageResistance;
//    public final Boolean[] damageImmunity;
//    public final int[] abilities;
    public final HashMap<Ability, Integer> abilities;
    public final HashMap<Ability, Integer> savingThrows;
    public final HashMap<Skill, Integer> skills;
    public final HashMap<DamageType, Boolean> damageResistance;
    public final HashMap<DamageType, Boolean> damageImmunity;
    public HashMap<String, String> raceFeatures;
    public ArrayList<String> languages;
//    private int
//     ячейки заклинаний резисты иммунититы статы навыки спасброски уязвимости состояния

    public Player() {
        race = null;
        classes = new ArrayList<>();
        abilities = new HashMap<>();
        skills = new HashMap<>();
        savingThrows = new HashMap<>();
        damageResistance = new HashMap<>();
        damageImmunity = new HashMap<>();
        raceFeatures = new HashMap<String, String>();
        languages = new ArrayList<>();
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void deleteRace(Race race) {
        raceFeatures.clear();
    }

    public void appendClass(Class otherClass) {
        if (mainClass == null) {
            mainClass = otherClass;
        }
        classes.add(otherClass);
    }

    public void levelUp() {
        level++;
        race.levelUp();
    }

    public int getSkill(Skill skill) {
        return skills.get(skill);
    }

    public int getAbility(Ability ability) {
        return abilities.get(ability);
    }

    public int getSavingThrow(Ability ability) {
        return savingThrows.get(ability);
    }

    protected int getModAbility(Ability ability) {
        return (abilities.get(ability) - 10) / 2;
    }

    /**
     * Добавляет начальные характеристики за очки
     * */
    public void setStartAbilities() {

    }
    // повышение хп и всего другого после бафом разных
    public void update() {

    }

    public void buff() {
        race.buff(this);
    }

    public int getHitPointsMax() {
        return 0;
    }

    public int getInitiative() {
        return 0;
    }
}
