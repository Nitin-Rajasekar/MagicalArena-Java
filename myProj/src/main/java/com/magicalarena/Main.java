package com.magicalarena;

import com.magicalarena.dice.SixSidedDie;
import com.magicalarena.strategy.AttackStrategy;
import com.magicalarena.strategy.DefendStrategy;

public class Main {
    public static void main(String[] args) {

        final String ANSI_RESET = "\033[0m";
        final String ANSI_YELLOW = "\033[33m";

        // take in player attributes

        System.out.println("Welcome to the Magical Arena!");

        // System.out.println("Enter Player 1's name:");

        // Player player1 = new Player(50, 5, 10, "Ramesh", "\033[34m");
        // Player player2 = new Player(100, 10, 5, "Suresh", "\033[32m");

        // Take the players attributes as input instead

        System.out.println(ANSI_YELLOW + "Enter Player 1's name:");
        String player1Name = System.console().readLine();

        System.out.println("Enter Player 1's health:");
        int player1Health = Integer.parseInt(System.console().readLine());

        System.out.println("Enter Player 1's strength:");
        int player1Strength = Integer.parseInt(System.console().readLine());

        System.out.println("Enter Player 1's attack:");
        int player1Attack = Integer.parseInt(System.console().readLine());

        System.out.println("Enter Player 2's name:");
        String player2Name = System.console().readLine();

        System.out.println("Enter Player 2's health:");
        int player2Health = Integer.parseInt(System.console().readLine());

        System.out.println("Enter Player 2's strength:");
        int player2Strength = Integer.parseInt(System.console().readLine());

        System.out.println("Enter Player 2's attack:");
        int player2Attack = Integer.parseInt(System.console().readLine());

        Player player1 = new Player(player1Health, player1Strength, player1Attack, player1Name, "\033[34m");
        Player player2 = new Player(player2Health, player2Strength, player2Attack, player2Name, "\033[32m");

        AttackStrategy attackStrategy = new AttackStrategy(new SixSidedDie());
        DefendStrategy defendStrategy = new DefendStrategy(new SixSidedDie());

        Arena arena = new Arena(player1, player2, attackStrategy, defendStrategy);
        arena.startBattle();
    }
}
