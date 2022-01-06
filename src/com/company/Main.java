package com.company;

import javax.management.StringValueExp;

public class Main {

    public static void main(String[] args) {
        Hero mage = new Hero("Mage",300,25,"MagicalKick");
        // System.out.println(mage.getHealth() + " " + mage.getDamage() + " " + mage.getSuperPower());

        Boss boss = new Boss();
        boss.setDamage(100);
        boss.setHealth(10000);
        boss.setTypeOfDefence("Antimage");

        System.out.println(boss.getDamage() + " " + boss.getHealth() + " " + boss.getTypeOfDefence());

        createHeroes();

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Персонаж с именем: " + createHeroes()[i].getNameOfHero()+
                    ", имеет очки здоровья в количестве: " + createHeroes()[i].getHealth() +
                    "ед., также наносит урон в количестве: " + createHeroes()[i].getDamage() +
                    " ед. и имеет супер-способность: " + createHeroes()[i].getSuperPower()+ '.');
        }
    }
    public static Hero[] createHeroes ()  {

        Hero druid = new Hero("Druid",300,25,"Druid's stick power");
        Hero berserk = new Hero("Berserk",400, 30);
        Hero uncleWithHammer = new Hero("UncleWithHammer",100,50, "Hammer blow on the little toe of the left foot");
        Hero [] heroes = {druid, berserk, uncleWithHammer};

        return heroes;
    }
}





