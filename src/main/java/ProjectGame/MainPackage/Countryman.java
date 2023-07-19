package ProjectGame.MainPackage;

import java.util.ArrayList;

public class Countryman extends Unit {
    private int numberOfReplenishments;
    private int bringArrows;


    public Countryman(String name, int hp, int armor, int movePoints, int numberOfReplenishments, int bringArrows, int x, int y) {
        super(name, hp, armor, movePoints, x, y);
        this.numberOfReplenishments = numberOfReplenishments;
        this.bringArrows = bringArrows;
    }

    public Countryman(int x, int y) {
        this("Бродяга", 10, 0, 0, 2, 3, x, y);
    }

    public int getNumberOfReplenishments() {
        return numberOfReplenishments;
    }

    public int getBringArrows() {
        return bringArrows;
    }


    @Override
    public void step(ArrayList<Unit> units) {
        Unit tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }

    @Override
    public String getInfo() {
        return String.format("Персонаж : %s, имя : %s, x : %d, y : %d ", getClass().getSimpleName(), getName(), coordinates.getX(), coordinates.getY());
    }


}
