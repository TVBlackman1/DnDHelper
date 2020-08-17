package mypackage;

import mypackage.properties.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Player {
    public Race race;
    public ArrayList<Class> classes;
    public Class mainClass;
    public short level;
    public short hitPoints;
    public short hitPointsMax;
    public short speed;
    public short AC;
    public short initiative;
    public final short[] abilities;
    public final short[] skills;
    public final short[] savingThrows;
    public final Boolean[] damageResistance;
    public final Boolean[] damageImmunity;
    public HashMap<String, String> features;
    public ArrayList<String> languages;
//    private short
//     ячейки заклинаний резисты иммунититы статы навыки спасброски уязвимости состояния

    public Player() {
        race = null;
        classes = new ArrayList<>();
        abilities = new short[6];
        skills = new short[18];
        savingThrows = new short[6];
        damageResistance = new Boolean[13];
        damageImmunity = new Boolean[13];
        features = new HashMap<String, String>();
        languages = new ArrayList<>();
    }

    public void setRace(Race race) {
        this.race = race;
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

    public short getSkill(Skill skill) {
        return skills[skill.ordinal()];
    }

    public short getAbility(Ability ability) {
        return abilities[ability.ordinal()];
    }

    public short getSavingThrows(Ability ability) {
        return savingThrows[ability.ordinal()];
    }
}
