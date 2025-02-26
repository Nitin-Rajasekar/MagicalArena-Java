package com.magicalarena.strategy;

import com.magicalarena.Player;
import com.magicalarena.dice.Die;

public class DefendStrategy {
    private Die defendDie;

    private final String ANSI_RESET="\033[0m";


    public DefendStrategy(Die defendDie) {
        this.defendDie = defendDie;
    }

    public int defend(Player defender) {
      

        // Rolls the die to determine the base attack value


        int rollValue= defendDie.roll();
        System.out.printf(defender.getColour_code() + "The defending dice roll value is %d\n", rollValue);
        
        // Calculating the net defence potential based on the player's defence attributte and die roll

        int defencePotential= defender.getStrength() * rollValue;
        System.out.printf(defender.getColour_code()+defender.getName()+ "'s net defence potential is %d\n" + ANSI_RESET, defencePotential);
        return defencePotential;

    }
}

