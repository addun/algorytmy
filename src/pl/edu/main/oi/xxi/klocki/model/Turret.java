package pl.edu.main.oi.xxi.klocki.model;

import java.util.ArrayList;

/**
 * Created by adrian on 31/10/16.
 */
public class Turret {
    ArrayList<Integer> turret = new ArrayList<>();

    public void addNextBlock(int color) {
        turret.add(color);
    }

    public int getBlock(int index) {
        return turret.get(index);
    }

    public void deleteLastBlock() {
        turret.remove(turret.size() - 1);
    }

    public int getLastColor() {
        if (!turret.isEmpty())
            return turret.get(turret.size() - 1);
        else
            return -1;
    }

    public int getSize() {
        return turret.size();
    }

    @Override
    public String toString() {
        return turret.toString();
    }
}
