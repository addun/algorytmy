package pl.edu.main.oi.xxi.bar;

import java.util.Random;

import pl.edu.main.oi.xxi.bar.model.*;


/**
 * Created by adrian on 30/10/16.
 */
public class SaladHandling {
    SaladBar saladBar;

    public SaladHandling(SaladBar saladBar) {
        this.saladBar = saladBar;
    }

    public int checkMaxQueue() {
        int leftToRight = 0;
        int rightToLeft = 0;
        int index = 0;
        int tempLTR;
        int tempRTL;
        for (int i = 0; i < saladBar.getFruitsQuantity(); i++) {
            tempLTR = maxQuantityFromLeftToRight(i);
            if (tempLTR > leftToRight) {
                leftToRight = tempLTR;
                index = i;
            }
        }
        for (int i = 0; i < leftToRight; i++) {
            tempRTL = maxQuantityFromRightToLeft(index + i, index);
            if (tempRTL > rightToLeft) {
                rightToLeft = tempRTL;
            }
        }
        return leftToRight > rightToLeft ? rightToLeft : leftToRight;
    }

    public int maxQuantityFromLeftToRight(int startIndex) {
        return maxQuantityFromLeftToRight(startIndex, saladBar.getFruitsQuantity() - 1);
    }

    public int maxQuantityFromLeftToRight(int startIndex, int endIndex) {
        int appleNumber = 0;
        int orangeNumber = 0;
        int isBreak = 0;
        for (int j = startIndex; j <= endIndex; j++) {
            Fruit nextFruit = saladBar.getFruit(j);
            if (nextFruit instanceof Apple)
                appleNumber++;
            else if (nextFruit instanceof Orange)
                orangeNumber++;

            if (orangeNumber < appleNumber) {
                isBreak = 1;
                break;
            }
        }
        return appleNumber + orangeNumber - isBreak;
    }

    public int maxQuantityFromRightToLeft(int startIndex) {
        return maxQuantityFromRightToLeft(startIndex, 0);
    }

    public int maxQuantityFromRightToLeft(int startIndex, int endIndex) {
        int appleNumber = 0;
        int orangeNumber = 0;
        int isBreak = 0;
        for (int j = startIndex; j >= endIndex; j--) {
            Fruit nextFruit = saladBar.getFruit(j);
            if (nextFruit instanceof Apple)
                appleNumber++;
            else if (nextFruit instanceof Orange)
                orangeNumber++;

            if (orangeNumber < appleNumber) {
                isBreak = 1;
                break;
            }
        }
        return appleNumber + orangeNumber - isBreak;
    }

    public void populateByCustomFluids(Fruit... fruits) {
        for (Fruit fruit : fruits) {
            saladBar.addFruit(fruit);
        }
    }

    public void populateByRandomFluids(int quantity) {
        for (int i = 0; i < quantity; i++) {
            addRandomFluid();
        }
    }

    public void addRandomFluid() {
        Fruit fruit;
        if (new Random().nextInt(2) == 1)
            fruit = new Apple();
        else
            fruit = new Orange();
        saladBar.addFruit(fruit);
    }

    public SaladBar getSaladBar() {
        return saladBar;
    }
}
