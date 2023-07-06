package PojectGame.Sorcerer;

public class Mage extends Sorcerer {
    public Mage(String name, int hp, int armor, int movePoints, int mana, String artifact) {
        super(name, hp, armor, movePoints, mana, artifact);
    }

    public Mage() {
        this("Гендальф", 40, 5, 10, 20, "Посох");
    }
}
