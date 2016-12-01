package pl.edu.main.oi.xxi.klocki;

import org.junit.Before;
import org.junit.Test;
import pl.edu.main.oi.xxi.klocki.model.Blocks;
import pl.edu.main.oi.xxi.klocki.model.Turret;

import static org.junit.Assert.*;

/**
 * Created by adrian on 31/10/16.
 */
public class PrecessTurretAndBlocksTest {
    private ProcessTurretAndBlocks processTurretAndBlocks;

    @Before
    public void setUp() throws Exception {
        processTurretAndBlocks = new ProcessTurretAndBlocks(new Turret(), new Blocks());
    }

    @Test
    public void moveAllBlockToTurret() throws Exception {
        processTurretAndBlocks.getBlocks().addNewBlock(7);
        processTurretAndBlocks.getBlocks().addNewBlock(3);
        processTurretAndBlocks.getBlocks().addNewBlock(5);
        processTurretAndBlocks.getBlocks().addNewBlock(3);
        processTurretAndBlocks.moveAllBlockToTurret();
        System.out.println(processTurretAndBlocks.getTurret());
        assertTrue(true);
    }

    @Test
    public void moveBlockToTurret() {
        processTurretAndBlocks.getBlocks().addNewBlock(82);
        processTurretAndBlocks.getBlocks().addNewBlock(8);
        processTurretAndBlocks.getBlocks().addNewBlock(90);
        processTurretAndBlocks.moveBlockToTurret(1);

        assertEquals(7, processTurretAndBlocks.getBlocks().getQuantityOfBlocks(1));
        assertEquals(1, processTurretAndBlocks.getTurret().getSize());
        assertEquals(1, processTurretAndBlocks.getTurret().getBlock(0));
    }

}