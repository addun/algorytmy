package pl.edu.main.oi.xxi.klocki.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by adrian on 31/10/16.
 */
public class Blocks {
    private ArrayList<Integer> blocks = new ArrayList<>();

    public void addNewBlock(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity can not by less than 0");
        }
        blocks.add(quantity);
    }

    public void deleteOneBlock(int indexColor) {
        if (blocks.get(indexColor) <= 0) {
            throw new IllegalArgumentException("Color " + indexColor + " do not have any blocks");
        }
        blocks.set(indexColor, blocks.get(indexColor) - 1);
    }

    public void addOneBlockToColor(int indexColor) {
        blocks.set(indexColor, blocks.get(indexColor) + 1);

    }

    public int getQuantityOfBlocks(int index) {
        return blocks.get(index);
    }

    public boolean isAllBlocksEqualsZero() {
        boolean is = true;
        for (int quantity : blocks) {
            if (quantity > 0) {
                is = false;
                break;
            }
        }
        return is;
    }

    public int getBlockIndexWithMaxQuantity() {
        return getBlockIndexWithMaxQuantity(1);
    }

    public int getBlockIndexWithMaxQuantity(int n) {
        ArrayList<Integer> sortList = getCloneReverseAndSortBlocksArray();
        ArrayList<Integer> blocksClone = new ArrayList<>(blocks);

        for (int i = 0; i < n - 1; i++) {
            int maxValue = sortList.get(i);
            blocksClone.set(blocksClone.indexOf(maxValue), -1);
        }
        int integer = sortList.get(n - 1);
        return blocksClone.indexOf(integer);
    }

    public int getQuantityAllBlocks() {
        int sum = 0;
        for (int quantity : blocks) {
            sum += quantity;
        }
        return sum;
    }

    public int getNumberOfColors() {
        return blocks.size();
    }

    private ArrayList<Integer> getCloneReverseAndSortBlocksArray() {
        ArrayList<Integer> blocksClone = new ArrayList<>(blocks);
        Collections.sort(blocksClone);
        Collections.reverse(blocksClone);
        return blocksClone;
    }
}
