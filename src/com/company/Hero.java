package com.company;

public class Hero {
    private int health;
    private int damage;
    private String superPower;
    private String nameOfHero;

    public Hero(String nameOfHero, int health, int damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
        this.nameOfHero = nameOfHero;
    }

    public Hero(String nameOfHero, int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.nameOfHero = nameOfHero;

    }
    //- getters
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }

    public String getNameOfHero() {return nameOfHero;
    }

}

