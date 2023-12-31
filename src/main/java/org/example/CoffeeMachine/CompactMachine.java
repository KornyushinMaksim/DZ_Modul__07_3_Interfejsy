package org.example.CoffeeMachine;

public class CompactMachine extends CappuccinoMachine{
    private int beansCoffeeContainer;

    public CompactMachine() {
        super();
    }

    public CompactMachine(
            String name, String model) {
        super(name, model);
            this.beansCoffeeContainer = super.grandeCoffeeContainer;
    }

    @Override
    public void makeCoffee(int value) {
        if (this.power) {
            if (error()) {
                switch (value) {
                    case 0:
                        americano();
                        break;
                    case 1:
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
}
