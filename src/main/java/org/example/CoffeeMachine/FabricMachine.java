package org.example.CoffeeMachine;

public abstract class FabricMachine implements iEspresso, iAmericano {
    protected boolean power;
    protected String name;
    protected String model;
    protected int cleanBox;
    protected int grandeCoffeeContainer;//молотый кофе
    protected int waterContainer;
    protected String getMassage;

    public FabricMachine() {
    }

    public FabricMachine(String name, String model) {
        this.name = name;
        this.model = model;
        if (model.contains("250")) {
            this.cleanBox = 150;
            this.grandeCoffeeContainer = 250;
            this.waterContainer = 2500;
            this.power = false;
        }
        if (model.contains("500")) {
            this.cleanBox = 250;
            this.grandeCoffeeContainer = 500;
            this.waterContainer = 5000;
            this.power = false;
        }
        if (model.contains("1000")) {
            this.cleanBox = 600;
            this.grandeCoffeeContainer = 1000;
            this.waterContainer = 7000;
            this.power = false;
        }
    }

    public int getGrandeCoffeeContainer() {
        return grandeCoffeeContainer;
    }

    public int getWaterContainer() {
        return waterContainer;
    }

    public String getGetMassage() {
        return getMassage;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void power(boolean power) {
        this.power = power;
    }

    public void makeCoffee(int value) {
    }

    public boolean error() {
        if (this.waterContainer <= 200 || this.grandeCoffeeContainer <= 50 || this.cleanBox <= 50) {
            return false;
        } else {
            return true;
        }
    }

    public String errorMassage() {
        String str = "";
        if (this.waterContainer <= 200) {
            str = "Закончилась вода";
        }
        if (this.grandeCoffeeContainer <= 50) {
            str = "Закончился кофе";
        }
        if (this.cleanBox <= 50) {
            str = "Очистите контейнер";
        }
        return str;
    }

    @Override
    public void espresso() {
        this.grandeCoffeeContainer -= 22;
        this.waterContainer -= 30;
        this.cleanBox -= 22;
        this.getMassage = "Эспрессо приготовлен";
    }

    @Override
    public void americano() {
        this.grandeCoffeeContainer -= 22;
        this.waterContainer -= 100;
        this.cleanBox -= 22;
        this.getMassage = "Американо приготовлен";
    }

    public void clearCoffeeBox() {
        if (model.contains("250")) {
            this.cleanBox = 150;
        }
        if (model.contains("500")) {
            this.cleanBox = 250;
        }
        if (model.contains("1000")) {
            this.cleanBox = 600;
        }
        this.getMassage = "Контейнер очищен";
    }

    public void replenishWater() {
        if (model.contains("250")) {
            this.waterContainer = 2500;
        }
        if (model.contains("500")) {
            this.waterContainer = 5000;
        }
        if (model.contains("1000")) {
            this.waterContainer = 7000;
        }
         this.getMassage = "Вода налита";
    }

    public void replenishCoffee() {
        if (model.contains("250")) {
            this.grandeCoffeeContainer = 250;
        }
        if (model.contains("500")) {
            this.grandeCoffeeContainer = 500;
        }
        if (model.contains("1000")) {
            this.grandeCoffeeContainer = 1000;
        }
        this.getMassage = "Кофе досыпан";
    }

    @Override
    public String toString() {
        return String.format("кофе: %d\nвода: %d", grandeCoffeeContainer, waterContainer);
    }

}
