package PojectGame.Shooter;

public class Arbolist extends Shooter {

    public Arbolist(String name, int hp, int armor, int movePoints, int numberOfArrows, String weapon, int damage) {
        super(name, hp, armor, movePoints, numberOfArrows, weapon, damage);
    }

    public Arbolist() {
        this("Зоркий глаз", 10, 20, 5, 7, "Арбалет", 5);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return String.format("Персонаж : %s", getClass().getSimpleName());
    }
}
