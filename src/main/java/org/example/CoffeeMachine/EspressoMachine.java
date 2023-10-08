package org.example.CoffeeMachine;

public class EspressoMachine extends FabricMachine {

    public EspressoMachine() {
        super();
    }

    public EspressoMachine(String name, String model) {
        super(name, model);
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
                }
            } else {
                this.getMassage = errorMassage();
            }
        } else {
            this.getMassage = "Кофемашина выключена";
        }
    }
}
