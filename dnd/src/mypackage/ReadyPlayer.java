package mypackage;


import mypackage.properties.Ability;
import mypackage.properties.Skill;

/**
 * Готовый персонаж
 * появляется после генерации расы,
 * класса и начальных характеристик и появления черт
 * */
public class ReadyPlayer extends Player {
    ReadyPlayer(StartAbilities startAbilities, Race race, Class... classes) {
        this.race = race;

        setAbilities(startAbilities);
        setSkills();
        setSavingThrows();
        setHitPointsMax();
        setInitiative();
        setAC();
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



}
