package com.magicalarena;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void testPlayerInitialization() {

        // checking that the initialization of player attributes is as expected
        Player player = new Player(50, 5, 10, "Ramesh", "\033[34m");
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    // checking that the player health modification is as expected
    @Test
    public void testPlayerHealthModification() {
        Player player = new Player(50, 5, 10, "Suresh", "\033[32m");
        player.setHealth(40);
        assertEquals(40, player.getHealth());
    }

    // checking that the player is alive when health is greater than 0, and vice versa
    @Test
    public void testPlayerIsAlive() {
        Player player = new Player(50, 5, 10, "Ramesh", "\033[34m");
        assertTrue(player.isAlive());
        player.setHealth(0);
        assertFalse(player.isAlive());
    }
}
