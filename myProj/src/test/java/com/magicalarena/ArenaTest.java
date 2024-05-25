package com.magicalarena;

import com.magicalarena.dice.SixSidedDie;
import com.magicalarena.strategy.AttackStrategy;
import com.magicalarena.strategy.DefendStrategy;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArenaTest {
    @Test
    public void testBattle() {
        Player player1 = new Player(50, 5, 10, "Ramesh", "\033[34m");
        Player player2 = new Player(100, 10, 5, "Suresh", "\033[32m");

        AttackStrategy attackStrategy = new AttackStrategy(new SixSidedDie());
        DefendStrategy defendStrategy = new DefendStrategy(new SixSidedDie());

        Arena arena = new Arena(player1, player2, attackStrategy, defendStrategy);
        arena.startBattle();

        assertTrue(player1.isAlive() || player2.isAlive());
    }
}
