package org.example.CoffeeMachine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CappuccinoMachineTest {

    @Test
    void makeCoffee_espresso() {
        CappuccinoMachine capp = new CappuccinoMachine("mini", "m250");
        capp.power(true);
        capp.makeCoffee(0);
        Assertions.assertEquals(228, capp.getGrandeCoffeeContainer());
        Assertions.assertEquals(2470, capp.getWaterContainer());
    }

    @Test
    void makeCoffee_americano() {
        CappuccinoMachine capp = new CappuccinoMachine("mini", "m250");
        capp.power(true);
        capp.makeCoffee(1);
        Assertions.assertEquals(228, capp.getGrandeCoffeeContainer());
        Assertions.assertEquals(2400, capp.getWaterContainer());
    }

    @Test
    void makeCoffee_cappuccino200_400() {
        CappuccinoMachine capp = new CappuccinoMachine("mini", "m250");
        capp.power(true);
        capp.setVolume(200);
        capp.makeCoffee(2);
        Assertions.assertEquals(228, capp.getGrandeCoffeeContainer());
        Assertions.assertEquals(2470, capp.getWaterContainer());
        Assertions.assertEquals(400, capp.getMilkContainer());
        capp.setVolume(400);
        capp.makeCoffee(2);
        Assertions.assertEquals(206, capp.getGrandeCoffeeContainer());
        Assertions.assertEquals(2440, capp.getWaterContainer());
        Assertions.assertEquals(0, capp.getMilkContainer());

    }

    @Test
    void makeCoffee_latte200_400() {
        CappuccinoMachine latte = new CappuccinoMachine("mini", "m250");
        latte.power(true);
        latte.setVolume(200);
        latte.makeCoffee(2);
        Assertions.assertEquals(228, latte.getGrandeCoffeeContainer());
        Assertions.assertEquals(2470, latte.getWaterContainer());
        Assertions.assertEquals(400, latte.getMilkContainer());
        latte.setVolume(400);
        latte.makeCoffee(2);
        Assertions.assertEquals(206, latte.getGrandeCoffeeContainer());
        Assertions.assertEquals(2440, latte.getWaterContainer());
        Assertions.assertEquals(0, latte.getMilkContainer());
    }

    @Test
    void replenishMilk() {
    }
}