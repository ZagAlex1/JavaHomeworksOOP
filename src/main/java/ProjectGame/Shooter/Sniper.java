package ProjectGame.Shooter;

import ProjectGame.MainPackage.Unit;

import java.util.ArrayList;

public class Sniper extends Shooter {

    public Sniper(String name, int hp, int armor, int movePoints, int numberOfArrows, String weapon, int damage, int x, int y) {
        super(name, hp, armor, movePoints, numberOfArrows, weapon, damage, x, y);
    }

    public Sniper(int x, int y) {
        this("Дэдшот", 30, 20, 10, 10, "Снайперский арбалет", 10, x, y);

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
