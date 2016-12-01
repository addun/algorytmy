package pl.edu.main.oi.xxi.klocki.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by adrian on 31/10/16.
 */
public class TurretTest {
    private Turret turret;

    @Before
    public void setUp() throws Exception {
        turret = new Turret();
    }

    @Test
    public void addNextBlock() throws Exception {
        turret.addNextBlock(5);
        assertEquals(5, turret.getBlock(0));
    }

    @Test
    public void deleteLastBlock() throws Exception {
        turret.addNextBlock(3);
        turret.addNextBlock(8);
        turret.deleteLastBlock();
        assertEquals(1, turret.getSize());
    }

}