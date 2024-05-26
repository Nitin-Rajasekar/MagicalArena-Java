package com.magicalarena;

import com.magicalarena.strategy.AttackStrategy;
import com.magicalarena.strategy.DefendStrategy;

public class Arena {


    // class attributes

    private Player player1;
    private Player player2;
    private AttackStrategy attackStrategy;
    private DefendStrategy defendStrategy;

    private final String ANSI_RESET = "\033[0m";
    private final String ANSI_RED = "\033[31m";

    // Constructor that initializes the arena with players and strategies

    public Arena(Player player1, Player player2, AttackStrategy attackStrategy, DefendStrategy defendStrategy) {
        this.player1 = player1;
        this.player2 = player2;
        this.attackStrategy = attackStrategy;
        this.defendStrategy = defendStrategy;
    }

    

    public void startBattle() {

        // print the players names and their attributes

        System.out.printf(
                player1.getColour_code() + "Player 1: %s | Health: %d | Strength: %d | Attack: %d\n" + ANSI_RESET,
                player1.getName(), player1.getHealth(), player1.getStrength(), player1.getAttack());

        System.out.printf(
                player2.getColour_code() + "Player 2: %s | Health: %d | Strength: %d | Attack: %d\n" + ANSI_RESET,
                player2.getName(), player2.getHealth(), player2.getStrength(), player2.getAttack());

        // Determine who attacks first based on who has lower health
        boolean player1Turn = player1.getHealth() <= player2.getHealth();

        System.out.printf(ANSI_RED + "Player %s attacks first\n" + ANSI_RESET,
                player1Turn ? player1.getName() : player2.getName());

        // The battle continues as long as both players are alive
        while (player1.isAlive() && player2.isAlive()) {
            if (player1Turn) {
                // Player 1 attacks Player 2
                performAttack(player1, player2);
            } else {
                // Player 2 attacks Player 1
                performAttack(player2, player1);
            }

            // After an attack, check if both players are still alive
            if (!player1.isAlive() || !player2.isAlive()) {
                break;
            }

            // Alternate turns
            player1Turn = !player1Turn;
        }

        // Determine and announce the winner based on which player is still alive
        if (player1.isAlive()) {
            System.out.println(ANSI_RED + player1.getName() + " wins!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + player2.getName() + " wins!" + ANSI_RESET);
        }
    }

    private void performAttack(Player attacker, Player defender) {

        // Calculating the net damage dealt

        int attackDamage = attackStrategy.attack(attacker);
        int defense = defendStrategy.defend(defender);
        int damageDealt = Math.max(0, attackDamage - defense);
        defender.setHealth(defender.getHealth() - damageDealt);

        System.out.printf(ANSI_RED + "The net damage dealt by %s to %s is %d\n" + ANSI_RESET, attacker.getName(),
                defender.getName(), damageDealt);

        
        // Print the current state of both players after the attack

        System.out.printf(
                player1.getColour_code() + "Player 1: %s | Health: %d | Strength: %d | Attack: %d\n" + ANSI_RESET,
                player1.getName(), player1.getHealth(), player1.getStrength(), player1.getAttack());

        System.out.printf(
                player2.getColour_code() + "Player 2: %s | Health: %d | Strength: %d | Attack: %d\n" + ANSI_RESET,
                player2.getName(), player2.getHealth(), player2.getStrength(), player2.getAttack());
    }
}
