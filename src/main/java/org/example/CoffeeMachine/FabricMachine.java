package org.example.CoffeeMachine;

import jdk.nashorn.internal.runtime.OptimisticReturnFilters;
import sun.lwawt.macosx.CPrinterJob;

public abstract class FabricMachine implements iCoffee {
    protected boolean power;
    protected String name;
    protected String model;
    protected int cleanBox;
    protected int grandeCoffeeContainer;//молотый кофе
    protected int waterContainer;
    protected iCoffee coffee;
    protected String getMassage;

    public FabricMachine() {
    }

    public FabricMachine(String name, String model, int grandeCoffeeContainer, int waterContainer) {
        this.name = name;
        this.model = model;
        this.cleanBox = 0;
        this.grandeCoffeeContainer = grandeCoffeeContainer;
        this.waterContainer = waterContainer;
        this.power = false;
    }

    public double getGrandeCoffeeContainer() {
        return grandeCoffeeContainer;
    }

    public double getWaterContainer() {
        return waterContainer;
    }

    public boolean isPower() {
        return power;
    }

    @Override
    public void power(boolean power) {
        this.power = power;
    }

    @Override
    public String makeCoffee(int value) {
        return null;
    }

    @Override
    public void error(String str) {
        this.getMassage = str;
    }

    @Override
    public String espresso() {
        this.grandeCoffeeContainer -= 22;
        this.waterContainer -= 30;
        this.cleanBox += 22;
        return "Эспрессо приготовлен";
    }

    @Override
    public String americano() {
        this.grandeCoffeeContainer -= 22;
        this.waterContainer -= 100;
        this.cleanBox += 22;
        return "Американо приготовлен";
    }

    @Override
    public String cappuccino() {
        return null;
    }

    @Override
    public String latte() {
        return null;
    }

    @Override
    public String toString() {
        return String.format("кофе: %d\nвода: %d", grandeCoffeeContainer,waterContainer);
    }
}
