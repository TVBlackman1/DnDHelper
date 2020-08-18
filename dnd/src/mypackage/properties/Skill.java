package mypackage.properties;

public enum Skill {
    Athletics(Ability.Strength),
    Acrobatics(Ability.Dexterity),
    SleightOfHand(Ability.Dexterity),
    Stealth(Ability.Dexterity),
    Arcane(Ability.Intelligence),
    History(Ability.Intelligence),
    Investigation(Ability.Intelligence),
    Nature(Ability.Intelligence),
    Religion(Ability.Intelligence),
    AnimalHandling(Ability.Wisdom),
    Insight(Ability.Wisdom),
    Medicine(Ability.Wisdom),
    Perception(Ability.Wisdom),
    Survival(Ability.Wisdom),
    Deception(Ability.Charisma),
    Intimidation(Ability.Charisma),
    Performance(Ability.Charisma),
    Persuasion(Ability.Charisma);

    final private Ability ability;
    Skill(Ability _ability) {
        ability = _ability;
    }

    public Ability getAbility() {
        return this.ability;
    }
}
