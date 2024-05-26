package com.magicalarena;

public class Player {


    // Player attributes

    private int health;
    private int strength;
    private int attack;
    private String name;
    private String colour_code;

    // COnstructir for initializing the player with the attributes

    public Player(int health, int strength, int attack, String name, String colour_code) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.name = name;
        this.colour_code = colour_code;
        System.out.printf(colour_code+"Player %s has been instantiated\n", name);
    }

    // Getter functions

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public String getName() {
        return name;
    }

    public String getColour_code() {
        return colour_code;
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}

