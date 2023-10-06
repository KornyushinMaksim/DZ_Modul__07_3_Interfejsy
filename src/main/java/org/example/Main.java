

package org.example;

import org.example.CoffeeMachine.*;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine mini = new CoffeeMachine(
                "MINI", "MINI250", 250, 2500);
        CappuccinoMachine max = new CappuccinoMachine(
                "MAX", "MAX1000", 1000, 10000, 1000);
        CompactMachine compact = new CompactMachine(
                "COMPACT", "COM500", 500, 5000,500);
        System.out.println(mini.getGrandeCoffeeContainer());
        System.out.println(mini.getWaterContainer());

        iCoffee iC = mini;
        iC.power(true);
        System.out.println(mini.isPower());
        System.out.println(iC.makeCoffee(1));
        System.out.println(mini);
        System.out.println(iC.makeCoffee(2));
        System.out.println(mini);

        max.power(true);
        System.out.println(max.makeCoffee(1));
        System.out.println(max);
        System.out.println(max.makeCoffee(2));
        System.out.println(max);
        max.setVolume(200);
        System.out.println(max.makeCoffee(3));
        System.out.println(max);
        max.setVolume(400);
        System.out.println(max.makeCoffee(4));
        System.out.println(max);

        compact.power(true);
        System.out.println(compact.makeCoffee(1));
        System.out.println(compact);
        compact.setVolume(200);
        System.out.println(compact.makeCoffee(2));
        System.out.println(compact);
    }
}