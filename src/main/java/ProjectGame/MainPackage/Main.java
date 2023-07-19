package ProjectGame.MainPackage;


import ProjectGame.Melee.Rogue;
import ProjectGame.Melee.Spearman;
import ProjectGame.Shooter.Arbolist;
import ProjectGame.Shooter.Sniper;
import ProjectGame.Sorcerer.Mage;
import ProjectGame.Sorcerer.Monk;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Unit> firstTeam = makeUnit(10);
        info(firstTeam);
        System.out.println();
        ArrayList<Unit> secondTeam = makeUnit(10);
        info(secondTeam);

        firstTeam.forEach(n -> n.step(secondTeam));

    }

    public static void info(ArrayList<Unit> list) {
        for (Unit u : list) {
            System.out.println(u.getInfo());
        }
    }

    public static ArrayList<Unit> makeUnit(int length) {
        int caseNumber;
        ArrayList<Unit> team = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            caseNumber = new Random().nextInt(1, 8);
            switch (caseNumber) {
                case 1 -> team.add(new Countryman(new Random().nextInt(0, 11), new Random().nextInt(0, 11)));
                case 2 -> team.add(new Rogue(new Random().nextInt(0, 11), new Random().nextInt(0, 11)));
                case 3 -> team.add(new Spearman(new Random().nextInt(0, 11), new Random().nextInt(0, 11)));
                case 4 -> team.add(new Arbolist(new Random().nextInt(0, 11), new Random().nextInt(0, 11)));
                case 5 -> team.add(new Sniper(new Random().nextInt(0, 11), new Random().nextInt(0, 11)));
                case 6 -> team.add(new Mage(new Random().nextInt(0, 11), new Random().nextInt(0, 11)));
                case 7 -> team.add(new Monk(new Random().nextInt(0, 11), new Random().nextInt(0, 11)));
                default -> {
                }
            }
        }
        return team;
    }


}
