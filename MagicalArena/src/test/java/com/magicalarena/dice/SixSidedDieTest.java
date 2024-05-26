package com.magicalarena.dice;

import org.junit.Test;
import static org.junit.Assert.*;

public class SixSidedDieTest {
    @Test
    public void testDieRollRange() {

        // roll the die a hundred times, and make sure that the value is indeed always from 1 to 6
        SixSidedDie die = new SixSidedDie();
        for (int i = 0; i < 100; i++) {
            int roll = die.roll();
            assertTrue(roll >= 1 && roll <= 6);
        }
    }
}
