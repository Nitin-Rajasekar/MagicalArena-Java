package com.magicalarena;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void testPlayerInitialization() {
        Player player = new Player(50, 5, 10, "Ramesh", "\033[34m");
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    public void testPlayerHealthModification() {
        Player player = new Player(50, 5, 10, "Suresh", "\033[32m");
        player.setHealth(40);
        assertEquals(40, player.getHealth());
    }

   
}
