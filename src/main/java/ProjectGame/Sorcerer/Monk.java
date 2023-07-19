package ProjectGame.Sorcerer;

import ProjectGame.MainPackage.Unit;

import java.util.ArrayList;

public class Monk extends Sorcerer {
    public Monk(String name, int hp, int armor, int movePoints, int mana, String artifact, int x, int y) {
        super(name, hp, armor, movePoints, mana, artifact, x, y);
    }

    public Monk(int x, int y) {
        this("Михаил", 50, 5, 10, 20, "Крест", x, y);
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
