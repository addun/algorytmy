package pl.edu.main.oi.xxi.bar;

import pl.edu.main.oi.xxi.bar.model.*;


import java.util.ArrayList;

/**
 * Created by adrian on 30/10/16.
 */
public class SaladBar {
    private ArrayList<Fruit> fruits = new ArrayList<>();

    public String getFruitsSignature() {
        StringBuilder signatures = new StringBuilder();
        for (Fruit fruit : fruits) {
            signatures = signatures.append(fruit.getFruitSignature());
        }
        return signatures.toString();
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public Fruit getFruit(int index) {
        if (index > fruits.size())
            throw new IndexOutOfBoundsException();
        return fruits.get(index);
    }

    public int getFruitsQuantity() {
        return fruits.size();
    }


}
