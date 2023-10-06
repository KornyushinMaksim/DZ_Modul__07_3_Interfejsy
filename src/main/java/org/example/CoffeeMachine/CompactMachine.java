package org.example.CoffeeMachine;

public class CompactMachine extends CappuccinoMachine{
    private int beansCoffeeContainer;

    public CompactMachine() {
        super();
    }

    public CompactMachine(
            String name, String model, int beansCoffeeContainer, int waterContainer, int milkContainer) {
        super(name, model, beansCoffeeContainer, waterContainer, milkContainer);
        this.beansCoffeeContainer = beansCoffeeContainer;
    }

    @Override
    public String makeCoffee(int value) {
        String str = "";
        switch (value){
            case 1:
                str = americano();
                break;
            case 2:
                str = latte();
                break;
        }
        return str;
    }
}
