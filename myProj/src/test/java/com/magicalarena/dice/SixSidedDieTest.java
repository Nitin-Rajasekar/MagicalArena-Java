package com.magicalarena.dice;

import org.junit.Test;
import static org.junit.Assert.*;

public class SixSidedDieTest {
    @Test
    public void testDieRollRange() {
        SixSidedDie die = new SixSidedDie();
        for (int i = 0; i < 100; i++) {
            int roll = die.roll();
            assertTrue(roll >= 1 && roll <= 6);
        }
    }
}
