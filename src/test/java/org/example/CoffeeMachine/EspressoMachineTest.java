package org.example.CoffeeMachine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EspressoMachineTest {

    @Test
    void makeCoffee_espresso() {
        EspressoMachine machine = new EspressoMachine("mini", "m250");
        machine.power(true);
        machine.makeCoffee(0);
        Assertions.assertEquals(228, machine.getGrandeCoffeeContainer());
        Assertions.assertEquals(2470, machine.getWaterContainer());
    }

    @Test
    void makeCoffee_americano() {
        EspressoMachine machine = new EspressoMachine("mini", "m250");
        machine.power(true);
        machine.makeCoffee(1);
        Assertions.assertEquals(228, machine.getGrandeCoffeeContainer());
        Assertions.assertEquals(2400, machine.getWaterContainer());
    }
}