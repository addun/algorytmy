package pl.edu.main.oi.xxi.klocki;

import pl.edu.main.oi.xxi.klocki.model.Blocks;
import pl.edu.main.oi.xxi.klocki.model.Turret;

import java.util.Scanner;

/**
 * Created by adrian on 31/10/16.
 */

/*
http://main.edu.pl/pl/archive/oi/21/klocki
 */
public class Main {
    public static void runAlgoritm() {
        System.out.println("Treść zadania: http://main.edu.pl/pl/archive/oi/21/klocki");

        ProcessTurretAndBlocks manager = new ProcessTurretAndBlocks(new Turret(), new Blocks());
        System.out.println("Wpisz liczbę kolorów");
        Scanner scanner = new Scanner(System.in);
        int blocks = scanner.nextInt();
        System.out.println("Podaj kolor pierwszego klocka");
        int firstBlockColor = scanner.nextInt() - 1;
        System.out.println("Podaj kolor ostatniego klocka");
        int lastBlockColor = scanner.nextInt() - 1;
        for (int i = 0; i < blocks; i++) {
            System.out.println("Podaj ilośc kloców w kolerze " + (i + 1));
            manager.getBlocks().addNewBlock(scanner.nextInt());
        }
        try {
            manager.moveBlockToTurret(firstBlockColor);
            manager.getBlocks().deleteOneBlock(lastBlockColor);
            manager.moveAllBlockToTurret();
            manager.getBlocks().addOneBlockToColor(lastBlockColor);
            manager.moveAllBlockToTurret();
            System.out.println(manager.getTurret());
        } catch (Exception e) {
            System.out.println("Nie można ułożyć wieży z podanych klocków!");
        }
    }
}
