package PojectGame.Melee;

public class Spearman extends Melee {
    public Spearman(String name, int hp, int armor, int movePoints, int damage, String weapon) {
        super(name, hp, armor, movePoints, damage, weapon);
    }

    public Spearman() {
        this("Доблестный", 30, 20, 10, 10, "Копье");
    }
}
