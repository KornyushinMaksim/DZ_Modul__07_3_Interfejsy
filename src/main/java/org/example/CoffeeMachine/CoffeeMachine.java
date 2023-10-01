package org.example;

public class CoffeeMachine {
    protected String name;
    protected String model;
    protected double grandeCoffeeContainer;//молотый кофе
    protected double waterContainer;

    public CoffeeMachine() {
    }

    public CoffeeMachine(String name, String model, double grandeCoffeeContainer, double waterContainer) {
        this.name = name;
        this.model = model;
        this.grandeCoffeeContainer = grandeCoffeeContainer;
        this.waterContainer = waterContainer;
    }

    private boolean testModel(){
        if ((this.model.contains("100")) || (this.model.contains("500")) || (this.model.contains("1000"))){
            return true;
        } else {
            return false;
        }
    }
}
