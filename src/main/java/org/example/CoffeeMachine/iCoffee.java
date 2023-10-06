package org.example.CoffeeMachine;

public interface iCoffee extends iEspresso, iAmericano, iCappuccino, iLatte{
    void power(boolean power);
    String makeCoffee(int value);
    default void clearCoffeeBox(int value){
        value = 0;
    }
    void error(String str);
}
