package org.example;

import org.example.Work.WorkCoffeeMachine;

public class Main {
    public static void main(String[] args) {
        WorkCoffeeMachine working = new WorkCoffeeMachine();
        working.choiceCoffeeMachine();
        if (working.getView() == 1) {
            for (int i = 0; i < 20; i++) {
                System.out.println(working.workEspressoMachine());
            }
            System.out.println(working.getEspressoMachine());
        } else if (working.getView() == 2) {
            for (int i = 0; i < 20; i++) {
                System.out.println(working.workCappuccinoMachine());
            }
            System.out.println(working.getCappuccinoMachine());
        } else if (working.getView() == 3) {
            for (int i = 0; i < 20; i++) {
                System.out.println(working.workCompactMachine());
            }
            System.out.println(working.getCompactMachine());
        }
    }
}