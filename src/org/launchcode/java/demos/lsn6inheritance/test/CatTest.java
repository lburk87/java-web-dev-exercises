package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.jupiter.api.Test;
import org.launchcode.java.demos.lsn6inheritance.main.HouseCat;

import static org.junit.Assert.assertEquals;

public class CatTest {
    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
}
