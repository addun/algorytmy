package pl.edu.main.oi.xxi.bar;


import org.junit.Before;
import org.junit.Test;
import pl.edu.main.oi.xxi.bar.model.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by adrian on 30/10/16.
 */
public class SaladHandlingTest {
    SaladHandling saladHandling;
    Fruit fluits[] = {new Orange(), new Apple(), new Orange(), new Apple(), new Apple(), new Orange()};

    @Before
    public void setUp() throws Exception {
        saladHandling = new SaladHandling(new SaladBar());
    }

    @Test
    public void checkMaxQueue() throws Exception {
        saladHandling.populateByCustomFluids(fluits);
        assertEquals(3, saladHandling.checkMaxQueue());

    }

    @Test
    public void maxQuantityFromLeftToRight() throws Exception {
        saladHandling.populateByCustomFluids(fluits);
        assertEquals(4, saladHandling.maxQuantityFromLeftToRight(0));

    }

    @Test
    public void maxQuantityFromRightToLeft() throws Exception {
        saladHandling.populateByCustomFluids(fluits);
        assertEquals(3, saladHandling.maxQuantityFromRightToLeft(2));
    }

    @Test
    public void populateByCustomFluids() throws Exception {
        saladHandling.populateByCustomFluids(fluits);
        assertEquals("pjpjjp", saladHandling.getSaladBar().getFruitsSignature());

    }

    @Test
    public void populateByRandomFluids() throws Exception {
        saladHandling.populateByRandomFluids(50);
        assertEquals(50, saladHandling.getSaladBar().getFruitsQuantity());
    }

    @Test
    public void addRandomFluid() throws Exception {
        saladHandling.addRandomFluid();
        assertEquals(1, saladHandling.getSaladBar().getFruitsQuantity());
    }

}