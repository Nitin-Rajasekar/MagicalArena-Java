package com.magicalarena.dice;

import java.util.Random;

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

