package org.example.CoffeeMachine;

public class CappuccinoMachine extends FabricMachine {
    private int milkContainer;
    private int volume;

    public CappuccinoMachine() {
        super();
    }

    public CappuccinoMachine(String name, String model, int grandeCoffeeContainer, int waterContainer, int milkContainer) {
        super(name, model, grandeCoffeeContainer, waterContainer);
        this.milkContainer = milkContainer;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String cappuccino() {
        super.espresso();
        this.milkContainer -= this.volume;
        return "Капучино приготовлен";
    }
    @Override
    public String latte() {
        super.espresso();
        this.milkContainer -= this.volume;
        return "Латте приготовлен";
    }

    @Override
    public String makeCoffee(int value) {
        String str = "";
        switch (value) {
            case 1:
                str = espresso();
                break;
            case 2:
                str = americano();
                break;
            case 3:
                str = cappuccino();
                break;
            case 4:
                str = latte();
                break;
        }
        return str;
    }

    @Override
    public String toString() {
        return String.format("%s\nмолоко: %d", super.toString(), this.milkContainer);
    }
}
