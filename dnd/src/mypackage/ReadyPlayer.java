package mypackage;


import mypackage.properties.Ability;
import mypackage.properties.DamageType;
import mypackage.properties.Skill;

import java.util.ArrayList;

/**
 * Готовый персонаж
 * появляется после генерации расы,
 * класса и начальных характеристик и появления черт
 * */
public class ReadyPlayer extends Player {
    ReadyPlayer(StartAbilities startAbilities, Race race, ArrayList<Class> classes) {
        super();
        this.race = race;

        setAbilities(startAbilities);
        setSkills();
        setSavingThrows();
        setHitPointsMax();
        setInitiative();
        setAC();
        setDamageResistant();
        setDamageImmunity();
        setSpeed();
        setLanguages();
    }

    private void setHitPointsMax() {
        int constBonus = getModAbility(Ability.Constitution) * race.level;
        int raceBonus = race.getHitPointsMax();
        int countClassBonus = 0;
        for (Class _class: classes) {
            countClassBonus += _class.getHitPointsMax();
        }
        hitPointsMax = constBonus + raceBonus + countClassBonus;
        // TODO add feats
    }

    private void setInitiative() {
        int dexterBonus  = getModAbility(Ability.Dexterity);
        int raceBonus = race.getInitiative();
        int countClassBonus = 0;
        for (Class _class: classes) {
            countClassBonus += _class.getHitPointsMax();
        }
        initiative = dexterBonus + raceBonus + countClassBonus;
        // TODO add feats
    }

    private void setAbilities(StartAbilities startAbilities) {
        for (Ability ability: Ability.values()) {
            int count = 0;
            count += startAbilities.abilities.get(ability);
            count += race.abilities.get(ability);
            for (Class _class: classes) {
                count += _class.abilities.get(ability);
            }
            abilities.put(ability, count);
        }
    }

    private void setSkills() {
        for (Skill skill : Skill.values()) {
            int count = 0;
            count += getModAbility(skill.getAbility());
            count += race.getSkill(skill);
            for (Class _class: classes) {
                count += _class.getSkill(skill);
            }
            skills.put(skill, count);
        }
        // TODO add feats
    }

    private void setSavingThrows() {
        for (Ability ability: Ability.values()) {
            int count = 0;
            count += getModAbility(ability);
            count += race.getSavingThrow(ability);
            for (Class _class: classes) {
                count += _class.getSavingThrow(ability);
            }
            savingThrows.put(ability, count);
        }
        // TODO add feats
    }

    private void setAC() {
        AC = 10 + getModAbility(Ability.Dexterity);
        // TODO too many exceptions and add feats
    }

    private void setDamageResistant() {
        for (DamageType damageType: DamageType.values()) {
            boolean resist = race.damageResistance.get(damageType);
            for (Class _class: classes) {
                resist |= _class.damageResistance.get(damageType);
            }
            damageResistance.put(damageType, resist);
        }
        // TODO add feast

    }

    private void setDamageImmunity() {
        for (DamageType damageType: DamageType.values()) {
            boolean immunity = race.damageImmunity.get(damageType);
            for (Class _class: classes) {
                immunity |= _class.damageImmunity.get(damageType);
            }
            damageImmunity.put(damageType, immunity);

        }
        // TODO add feast

    }

    private void setLanguages() {
        languages.clear();
        languages.addAll(race.languages);
        for (Class _class: classes) {
            languages.addAll(_class.languages);
        }
        // TODO add feast
    }

    private void setSpeed() { int raceBonus = race.speed;
        int countClassBonus = 0;
        for (Class _class: classes) {
            countClassBonus += _class.speed;
        }
        speed = raceBonus + countClassBonus;
        // TODO add feats
    }
}
