package org.example.CoffeeMachine;

public class CappuccinoMachine extends FabricMachine implements iCappuccino, iLatte {
    private int milkContainer;
    private int volume;

    public CappuccinoMachine() {
        super();
    }

    public CappuccinoMachine(String name, String model) {
        super(name, model);
        if (model.contains("250")) {
            this.milkContainer = 600;
        }
        if (model.contains("500")) {
            this.milkContainer = 2000;
        }
        if (model.contains("1000")) {
            this.milkContainer = 3000;
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getMilkContainer() {
        return milkContainer;
    }

    public boolean error() {
        if (this.waterContainer <= 200 ||
                this.grandeCoffeeContainer <= 50 ||
                this.cleanBox <= 50 ||
                this.milkContainer <= 120) {
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
        if (this.milkContainer <= 120) {
            str = "Закончилось молоко";
        }
        return str;
    }

    @Override
    public void cappuccino() {
        super.espresso();
        this.milkContainer -= this.volume;
        this.getMassage = "Капучино приготовлен";
    }

    @Override
    public void latte() {
        super.espresso();
        this.milkContainer -= this.volume;
        this.getMassage = "Латте приготовлен";
    }

    @Override
    public void makeCoffee(int value) {
        if (this.power) {
            if (error()) {
                switch (value) {
                    case 0:
                        espresso();
                        break;
                    case 1:
                        americano();
                        break;
                    case 2:
                        cappuccino();
                        break;
                    case 3:
                        latte();
                        break;
                }
            } else {
                this.getMassage = errorMassage();
            }
        } else {
            this.getMassage = "Кофемашина выключена";
        }
    }

    public void replenishMilk(){
        if (model.contains("250")) {
            this.milkContainer = 600;
        }
        if (model.contains("500")) {
            this.milkContainer = 2000;
        }
        if (model.contains("1000")) {
            this.milkContainer = 3000;
        }
        this.getMassage = "Молоко налито";
    }

    @Override
    public String toString() {
        return String.format("%s\nмолоко: %d", super.toString(), this.milkContainer);
    }
}
