package com.magicalarena.strategy;

import com.magicalarena.Player;
import com.magicalarena.dice.Die;

public class AttackStrategy {
    private Die attackDie;

    private final String ANSI_RESET="\033[0m";


    public AttackStrategy(Die attackDie) {
        this.attackDie = attackDie;
    }

    public int attack(Player attacker) {
        

        int rollValue= attackDie.roll();
        System.out.printf(attacker.getColour_code() + "The attacking dice roll value is %d\n", rollValue);
        int attackDamage= attacker.getAttack() + attackDie.roll();
        System.out.printf(attacker.getColour_code()+attacker.getName()+ "'s net attack damage is %d\n" + ANSI_RESET, attackDamage);
        return attackDamage;
    }
}
