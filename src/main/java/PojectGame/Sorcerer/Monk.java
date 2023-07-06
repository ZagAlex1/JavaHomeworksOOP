package PojectGame.Sorcerer;

public class Monk extends Sorcerer {
    public Monk(String name, int hp, int armor, int movePoints, int mana, String artifact) {
        super(name, hp, armor, movePoints, mana, artifact);
    }

    public Monk() {
        this("Михаил", 50, 5, 10, 20, "Крест");
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return String.format("Персонаж : %s", getClass().getSimpleName());
    }
}
