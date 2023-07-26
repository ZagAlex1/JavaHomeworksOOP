package ProjectGame.Melee;

import ProjectGame.MainPackage.Unit;

import java.util.ArrayList;

public class Spearman extends Melee {
    public Spearman(String name, int hp, int armor, int movePoints, int damage, String weapon, int x, int y) {
        super(name, hp, armor, movePoints, damage, weapon, x, y);
    }

    public Spearman(int x, int y) {
        this("Доблестный", 30, 20, 10, 10, "Копье", x, y);
    }

    @Override
    public void step(ArrayList<Unit> units1, ArrayList<Unit> units2) {
        Unit tmp = nearest(units1);
        System.out.println(tmp.getName() + " " + coordinates.countDistance(tmp.getCoordinates()));
    }

    @Override
    public void attack(Unit nearest) {

    }

    @Override
    public String getInfo() {
        return String.format("Персонаж : %s, имя : %s, x : %d, y : %d ", getClass().getSimpleName(), getName(), coordinates.getX(), coordinates.getY());
    }
}
