package ProjectGame.Sorcerer;

import ProjectGame.MainPackage.Unit;

import java.util.ArrayList;

public class Mage extends Sorcerer {
    public Mage(String name, int hp, int armor, int movePoints, int mana, String artifact, int x, int y) {
        super(name, hp, armor, movePoints, mana, artifact, x, y);
    }

    public Mage(int x, int y) {
        this("Гендальф", 40, 5, 10, 20, "Посох", x, y);
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
