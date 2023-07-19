package ProjectGame.MainPackage;

import ProjectGame.Interfaces.StepableAndInformatable;

import java.util.ArrayList;

public abstract class Unit implements StepableAndInformatable {

    protected String name;
    protected int hp;
    protected int armor;
    protected int movePoints;

    protected Coordinates coordinates;

    public Unit(String name, int hp, int armor, int movePoints, int x, int y) {
        this.name = name;
        if (setHp(hp)) {
            this.hp = hp;
        } else {
            this.hp = 1;
        }
        if (setArmor(armor)) {
            this.armor = armor;
        } else {
            this.armor = 0;
        }
        if (setMovePoints(movePoints)) {
            this.movePoints = movePoints;
        } else {
            this.movePoints = 1;
        }
        coordinates = new Coordinates(x, y);
    }

    public int getHp() {
        return hp;
    }

    public boolean setHp(int hp) {
        if (hp < 0) {
            return false;
        } else {
            this.hp += hp;
        }
        return true;
    }

    public int getArmor() {
        return armor;
    }

    public boolean setArmor(int armor) {
        if (armor < 0) {
            return false;
        } else {
            this.armor += armor;
        }
        return true;
    }

    public int getMovePoints() {
        return movePoints;
    }

    public boolean setMovePoints(int movePoints) {
        if (movePoints < 0) {
            return false;
        } else {
            this.movePoints += movePoints;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Unit nearest(ArrayList<Unit> units){
        double nearestDistance = Double.MAX_VALUE;
        Unit nearestEnemy = null;
        for (int i = 0; i < units.size(); i++) {
            if(coordinates.countDistance(units.get(i).coordinates) < nearestDistance){
                nearestDistance = coordinates.countDistance(units.get(i).coordinates);
                nearestEnemy = units.get(i);
            }
        }
        return nearestEnemy;
    }


}
