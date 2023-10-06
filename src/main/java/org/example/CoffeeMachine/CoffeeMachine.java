package org.example.CoffeeMachine;

public class CoffeeMachine extends FabricMachine{

    public CoffeeMachine() {
        super();
    }

    public CoffeeMachine(String name, String model, int grandeCoffeeContainer, int waterContainer) {
        super(name, model, grandeCoffeeContainer, waterContainer);
    }

    @Override
    public String makeCoffee(int value) {
        String str = "";
        if (this.power) {
            switch (value) {
                case 1:
                    str = espresso();
                    break;
                case 2:
                    str = americano();
                    break;
            }
        } else {
            str = "Кофемашина выключена";
        }
        return str;
    }
}
