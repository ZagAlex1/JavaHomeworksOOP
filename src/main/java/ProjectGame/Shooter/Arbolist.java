package ProjectGame.Shooter;

import ProjectGame.MainPackage.Unit;

import java.util.ArrayList;

public class Arbolist extends Shooter {

    public Arbolist(String name, int hp, int armor, int movePoints, int numberOfArrows, String weapon, int damage, int x, int y) {
        super(name, hp, armor, movePoints, numberOfArrows, weapon, damage, x, y);
    }

    public Arbolist(int x, int y) {
        this("Зоркий глаз", 10, 20, 5, 7, "Арбалет", 5, x, y);
    }

    @Override
    public void step(ArrayList<Unit> units) {
        Unit tmp = nearest(units);
        System.out.println(tmp.getName() + " " + coordinates.countDistance(tmp.getCoordinates()));
    }

    @Override
    public String getInfo() {
        return String.format("Персонаж : %s, имя : %s, x : %d, y : %d ", getClass().getSimpleName(), getName(), coordinates.getX(), coordinates.getY());
    }
}
