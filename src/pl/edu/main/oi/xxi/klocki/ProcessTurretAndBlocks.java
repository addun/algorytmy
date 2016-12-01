package pl.edu.main.oi.xxi.klocki;

import pl.edu.main.oi.xxi.klocki.model.Blocks;
import pl.edu.main.oi.xxi.klocki.model.Turret;

/**
 * Created by adrian on 31/10/16.
 */
public class ProcessTurretAndBlocks {


    private Blocks blocks;
    private Turret turret;

    public ProcessTurretAndBlocks(Turret turret, Blocks blocks) {
        this.blocks = blocks;
        this.turret = turret;
    }

    public void moveAllBlockToTurret() {
        int allBlocksToMove = blocks.getQuantityAllBlocks();
        for (int i = 0; i < allBlocksToMove; i++) {
            moveDifferenceColorBlockToTurret();
        }
    }

    public void moveDifferenceColorBlockToTurret() {
        boolean found = false;
        int maxIndex;
        for (int i = 1; i <= blocks.getNumberOfColors(); i++) {
            maxIndex = blocks.getBlockIndexWithMaxQuantity(i);
            if (turret.getLastColor() != maxIndex) {
                moveBlockToTurret(maxIndex);
                found = true;
                break;
            }
        }
        if (!found)
            throw new IllegalStateException("Can not build turret with this blocks");
    }

    public void moveBlockToTurret(int index) {
        blocks.deleteOneBlock(index);
        turret.addNextBlock(index);
    }


    public Turret getTurret() {
        return turret;
    }

    public Blocks getBlocks() {
        return blocks;
    }

}
