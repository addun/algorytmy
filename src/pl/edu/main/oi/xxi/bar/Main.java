package pl.edu.main.oi.xxi.bar;

import java.util.Scanner;



/*
http://main.edu.pl/pl/archive/oi/21/bar
 */

public class Main {
    public static void runAlgoritm() {
        System.out.println("Treść zadania: http://main.edu.pl/pl/archive/oi/21/bar");

        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Ile owoców ma być w barze?");
        int quantity = consoleScanner.nextInt();

        SaladHandling saladHandling = new SaladHandling(new SaladBar());
        saladHandling.populateByRandomFluids(quantity);
        System.out.println("Wylosowana sygnatura owoców");
        System.out.println(saladHandling.getSaladBar().getFruitsSignature());
        System.out.println("Maksymalna ilość owoców jaka może znaleźć się w sałatce, spełniająca kryteria");
        System.out.println(saladHandling.checkMaxQueue());
    }


}
