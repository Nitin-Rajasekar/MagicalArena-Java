package com.magicalarena.dice;

import java.util.Random;

// Implements the die interface, and represents a six-sided die

public class SixSidedDie implements Die {
    private Random random;

    public SixSidedDie() {
        this.random = new Random();
    }

    @Override
    public int roll() {
        return random.nextInt(6) + 1;
    }
}

