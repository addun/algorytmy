package pl.edu.main.oi.xxi.bar;

import org.junit.Before;
import org.junit.Test;
import pl.edu.main.oi.xxi.bar.model.*;


import static org.junit.Assert.*;

/**
 * Created by adrian on 30/10/16.
 */
public class SaladBarTest {

    private SaladBar saladBar;

    @Before
    public void setUp() throws Exception {
        saladBar = new SaladBar();
    }

    @Test
    public void getFruitsSignature() throws Exception {
        saladBar.addFruit(new Apple());
        saladBar.addFruit(new Orange());
        saladBar.addFruit(new Orange());
        saladBar.addFruit(new Apple());
        String signatories =
                new Apple().getFruitSignature() +
                        new Orange().getFruitSignature() +
                        new Orange().getFruitSignature() +
                        new Apple().getFruitSignature();
        assertTrue(saladBar.getFruitsSignature().equals(signatories));
    }

    @Test
    public void getFruitsQuantity() throws Exception {
        saladBar.addFruit(new Apple());
        saladBar.addFruit(new Orange());
        saladBar.addFruit(new Orange());
        saladBar.addFruit(new Apple());
        assertTrue(4 == saladBar.getFruitsQuantity());

    }


}