package PojectGame.Melee;

public class Rogue extends Melee {
    public Rogue(String name, int hp, int armor, int movePoints, int damage, String weapon) {
        super(name, hp, armor, movePoints, damage, weapon);
    }

    public Rogue() {
        this("Негодяй", 20, 10, 5, 5, "Дубина");
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return String.format("Персонаж : %s", getClass().getSimpleName());
    }
}
