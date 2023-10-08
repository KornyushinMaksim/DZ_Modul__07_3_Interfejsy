package org.example.CoffeeMachine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompactMachineTest {

    @Test
    void makeCoffee_americano() {
        CompactMachine cm = new CompactMachine("mini", "m250");
        cm.power(true);
        cm.makeCoffee(0);
        Assertions.assertEquals(228, cm.getGrandeCoffeeContainer());
        Assertions.assertEquals(2400, cm.getWaterContainer());
    }
    @Test
    void makeCoffee_latte200_400() {
        CompactMachine cm = new CompactMachine("mini", "m250");
        cm.power(true);
        cm.setVolume(200);
        cm.makeCoffee(1);
        Assertions.assertEquals(228, cm.getGrandeCoffeeContainer());
        Assertions.assertEquals(2470, cm.getWaterContainer());
        Assertions.assertEquals(400, cm.getMilkContainer());
        cm.setVolume(400);
        cm.makeCoffee(1);
        Assertions.assertEquals(206, cm.getGrandeCoffeeContainer());
        Assertions.assertEquals(2440, cm.getWaterContainer());
        Assertions.assertEquals(0, cm.getMilkContainer());
    }
}