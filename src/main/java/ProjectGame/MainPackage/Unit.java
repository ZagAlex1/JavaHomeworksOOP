package ProjectGame.MainPackage;

import ProjectGame.Interfaces.Attackable;
import ProjectGame.Interfaces.StepableAndInformatable;

import java.util.ArrayList;

public abstract class Unit implements StepableAndInformatable, Attackable {

    protected String name;
    protected int hp;
    protected int armor;
    protected int movePoints;

    protected Coordinates coordinates;

    public Unit(String name, int hp, int armor, int movePoints, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.movePoints = movePoints;
        coordinates = new Coordinates(x, y);
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public int getArmor() {
        return armor;
    }

    public int getMovePoints() {
        return movePoints;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Unit nearest(ArrayList<Unit> units) {
        double nearestDistance = Double.MAX_VALUE;
        Unit nearestEnemy = null;
        for (int i = 0; i < units.size(); i++) {
            if (coordinates.countDistance(units.get(i).coordinates) < nearestDistance) {
                nearestDistance = coordinates.countDistance(units.get(i).coordinates);
                nearestEnemy = units.get(i);
            }
        }
        return nearestEnemy;
    }

    public boolean isAlive() {
        return hp > 0;
    }

}
