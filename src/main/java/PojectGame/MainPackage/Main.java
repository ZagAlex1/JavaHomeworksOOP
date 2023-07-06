package PojectGame.MainPackage;


import PojectGame.Melee.Rogue;
import PojectGame.Melee.Spearman;
import PojectGame.Shooter.Arbolist;
import PojectGame.Shooter.Sniper;
import PojectGame.Sorcerer.Mage;
import PojectGame.Sorcerer.Monk;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Unit> firstTeam = makeUnit(10);
        info(firstTeam);
        System.out.println();
        ArrayList<Unit> secondTeam = makeUnit(10);
        info(secondTeam);

    }

    public static void info(ArrayList<Unit> list){
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
                case 1 -> team.add(new Countryman());
                case 2 -> team.add(new Rogue());
                case 3 -> team.add(new Spearman());
                case 4 -> team.add(new Arbolist());
                case 5 -> team.add(new Sniper());
                case 6 -> team.add(new Mage());
                case 7 -> team.add(new Monk());
                default -> {
                }
            }
        }
        return team;
    }


}
