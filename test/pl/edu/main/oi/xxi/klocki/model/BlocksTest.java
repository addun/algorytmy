package pl.edu.main.oi.xxi.klocki.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by adrian on 31/10/16.
 */
public class BlocksTest {
    private Blocks blocks;

    @Before
    public void setUp() throws Exception {
        blocks = new Blocks();
    }

    @Test
    public void addNewBlock() throws Exception {
        blocks.addNewBlock(50);
        assertEquals(50, blocks.getQuantityOfBlocks(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addNewBlockThrow() throws Exception {
        blocks.addNewBlock(-50);
    }

    @Test
    public void deleteOneBlock() throws Exception {
        blocks.addNewBlock(10);
        blocks.deleteOneBlock(0);
        assertEquals(9, blocks.getQuantityOfBlocks(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void deleteOneBlockThrow() throws Exception {
        blocks.addNewBlock(0);
        blocks.deleteOneBlock(0);
    }

    @Test
    public void getBlock() throws Exception {
        blocks.addNewBlock(50);
        assertEquals(50, blocks.getQuantityOfBlocks(0));
    }

    @Test
    public void getBlockIndexWithMaxQuantity() {
        blocks.addNewBlock(50);
        blocks.addNewBlock(25);
        blocks.addNewBlock(50);
        blocks.addNewBlock(50);
        blocks.addNewBlock(10);
        blocks.addNewBlock(14);
        blocks.addNewBlock(58);
        assertEquals(3, blocks.getBlockIndexWithMaxQuantity(4));
        assertEquals(50, blocks.getQuantityOfBlocks(blocks.getBlockIndexWithMaxQuantity(2)));

    }

    @Test
    public void isAllBlocksEqualsZero() {
        blocks.addNewBlock(2);
        blocks.addNewBlock(1);
        blocks.addNewBlock(2);
        blocks.deleteOneBlock(0);
        blocks.deleteOneBlock(0);
        blocks.deleteOneBlock(1);
        blocks.deleteOneBlock(2);
        assertFalse(blocks.isAllBlocksEqualsZero());
        blocks.deleteOneBlock(2);
        assertTrue(blocks.isAllBlocksEqualsZero());

    }

    @Test
    public void getQuantityAllColors() {
        blocks.addNewBlock(50);
        blocks.addNewBlock(10);
        blocks.addNewBlock(8);
        assertEquals(68, blocks.getQuantityAllBlocks());
    }

}