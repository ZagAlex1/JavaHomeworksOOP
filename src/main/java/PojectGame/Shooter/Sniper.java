package PojectGame.Shooter;

public class Sniper extends Shooter {

    public Sniper(String name, int hp, int armor, int movePoints, int numberOfArrows, String weapon, int damage) {
        super(name, hp, armor, movePoints, numberOfArrows, weapon, damage);
    }

    public Sniper(String name, int hp, int armor, int movePoints, int numberOfArrows, String weapon) {
        this("Дэдшот", 30, 20, 10, 10, "Снайперский арбалет", 10);

    }


}
