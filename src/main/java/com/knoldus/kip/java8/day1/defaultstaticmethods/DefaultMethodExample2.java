package com.knoldus.kip.java8.day1.defaultstaticmethods;

/**
 * Created by harmeet on 1/4/17.
 */

interface HollyWood {
    default void ironMan() {
        System.out.println("Tony Stark Rocks .... ");
    }

    default void tombRaider() {
        System.out.println("Angelina Jolie Cute ... ");
    }

    default void kissOfTheDragon() {
        System.out.println("Jet Li, Great Fighter ... ");
    }
}

interface BollyWood extends HollyWood {

    @Override
    default void ironMan() {
        System.out.println("Mai hoon Fauladi loha .... ");
    }

    void tombRaider();

    /*void kissOfTheDragon() {
        System.out.println("Maut ka Chumma ... ");
    }*/
}

public class DefaultMethodExample2 implements BollyWood {

    @Override
    public void tombRaider() {
        System.out.println("Sherni No. 1, Kamal Ki ... ");
    }

    public static void main(String... args) {
        DefaultMethodExample2 example2 = new DefaultMethodExample2();
        example2.tombRaider();
        example2.ironMan();
        example2.kissOfTheDragon();
    }
}
