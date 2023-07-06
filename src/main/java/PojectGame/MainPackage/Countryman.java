package PojectGame.MainPackage;

public class Countryman extends Unit {
    private int numberOfReplenishments;
    private int bringArrows;


    public Countryman(String name, int hp, int armor, int movePoints, int numberOfReplenishments, int bringArrows) {
        super(name, hp, armor, movePoints);
        this.numberOfReplenishments = numberOfReplenishments;
        this.bringArrows = bringArrows;
    }

    public Countryman() {
        this("Бродяга", 10, 0, 0, 2, 3);
    }

    public int getNumberOfReplenishments() {
        return numberOfReplenishments;
    }

    public int getBringArrows() {
        return bringArrows;
    }


}
