package mypackage;

public class Person extends Player {
    private ReadyPlayer readyPlayer;
    /**
     *
     * */
    public void update() {
        readyPlayer = new ReadyPlayer(startAbilities, race, classes);
    }

    public void setRace(Race race) {
        super.setRace(race);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        update();
    }
}
