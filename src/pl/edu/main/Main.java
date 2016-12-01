package pl.edu.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj!");
        System.out.println("Wybierz program który chcesz uruchomić:");
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("");
            System.out.println("0. Zamknij program");
            System.out.println("1. Bar sałatkowy");
            System.out.println("2. Klocki");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    pl.edu.main.oi.xxi.bar.Main.runAlgoritm();
                    break;
                case 2:
                    pl.edu.main.oi.xxi.klocki.Main.runAlgoritm();
                    break;
            }
        } while (choice != 0);

    }
}
