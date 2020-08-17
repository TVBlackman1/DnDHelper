package mypackage.properties;

public enum Skill {
    Athletics(Ability.Strength);

    final private Ability ability;
    Skill(Ability _ability) {
        ability = _ability;
    }

    public Ability getAbility() {
        return this.ability;
    }
}
