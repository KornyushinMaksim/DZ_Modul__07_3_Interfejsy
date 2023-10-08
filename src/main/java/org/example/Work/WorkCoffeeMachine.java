package org.example.Work;

import org.example.CoffeeMachine.CappuccinoMachine;
import org.example.CoffeeMachine.CompactMachine;
import org.example.CoffeeMachine.EspressoMachine;

import java.util.Scanner;

public class WorkCoffeeMachine {
    private EspressoMachine espressoMachine;
    private CappuccinoMachine cappuccinoMachine;
    private CompactMachine compactMachine;
    private int view;
    private Scanner in = new Scanner(System.in);

    public int getView() {
        return view;
    }

    public EspressoMachine getEspressoMachine() {
        return espressoMachine;
    }

    public CappuccinoMachine getCappuccinoMachine() {
        return cappuccinoMachine;
    }

    public CompactMachine getCompactMachine() {
        return compactMachine;
    }

    public void choiceCoffeeMachine() {
        this.view = 0;
        int model = 0;
        do {
            System.out.println("Выбирите вид кофе машины:" +
                    "\n1 - Эспрeссо машина(Эспрессо, американо)" +
                    "\n2 - Капучино-автомат(Эспрессо, американо, капучино, латте)" +
                    "\n3 - Американо машина(американо, латте)");
            this.view = in.nextInt();
        } while (this.view != 1 && this.view != 2 && this.view != 3);
        do {
            System.out.println("Выбирите модель:\n1 - Мини250\n2 - Мидл500\n3 - Макс1000");
            model = in.nextInt();
        } while (model != 1 && model != 2 && model != 3);
        if (this.view == 1) {
            if (model == 1) {
                espressoMachine = new EspressoMachine("EspressoMini", "m250");
            }
            if (model == 2) {
                espressoMachine = new EspressoMachine("EspressoMid", "m500");
            }
            if (model == 3) {
                espressoMachine = new EspressoMachine("EspressoMax", "m1000");
            }
        } else if (this.view == 2) {
            if (model == 1) {
                cappuccinoMachine = new CappuccinoMachine("CappuccinoMini", "m250");
            }
            if (model == 2) {
                cappuccinoMachine = new CappuccinoMachine("CappuccinoMId", "m500");
            }
            if (model == 3) {
                cappuccinoMachine = new CappuccinoMachine("CappuccinoMax", "m1000");
            }
        } else if (this.view == 3) {
            if (model == 1) {
                compactMachine = new CompactMachine("CompactMini", "m250");
            }
            if (model == 2) {
                compactMachine = new CompactMachine("CompactMid", "m500");
            }
            if (model == 3) {
                compactMachine = new CompactMachine("CompactMax", "m1000");
            }
        }
    }

    public String workEspressoMachine() {
        this.espressoMachine.power(true);
        int rand = (int) (Math.random() * 2);
        this.espressoMachine.makeCoffee(rand);
        clearMachine(espressoMachine.getGetMassage());
        return this.espressoMachine.getGetMassage();
    }

    public String workCappuccinoMachine() {
        this.cappuccinoMachine.power(true);
        int rand = (int) (Math.random() * 4);
        if (rand == 2 || rand == 3) {
            int value = 0;
            do {
                System.out.println("Объём молока: 1 - 200мл; 2 - 400мл");
                value = in.nextInt();
                if (value == 1) {
                    this.cappuccinoMachine.setVolume(200);
                } else if (value == 2) {
                    this.cappuccinoMachine.setVolume(400);
                } else {
                    System.out.println("Введено не корректное значение");
                }
            } while (value != 1 && value != 2);
        }
        this.cappuccinoMachine.makeCoffee(rand);
        clearMachine(cappuccinoMachine.getGetMassage());
        return this.cappuccinoMachine.getGetMassage();
    }

    public String workCompactMachine() {
        this.compactMachine.power(true);
        int rand = (int) (Math.random() * 2);
        if (rand == 1) {
            int value = 0;
            do {
                System.out.println("Объём молока: 1 - 200мл; 2 - 400мл");
                value = in.nextInt();
                if (value == 1) {
                    this.cappuccinoMachine.setVolume(200);
                } else if (value == 2) {
                    this.cappuccinoMachine.setVolume(400);
                } else {
                    System.out.println("Введено не корректное значение");
                }
            } while (value != 1 && value != 2);
        }
        this.compactMachine.makeCoffee(rand);
        clearMachine(compactMachine.getGetMassage());
        return this.compactMachine.getGetMassage();
    }

    private void clearMachine(String str) {
        if (str.contains("Очистите контейнер")) {
            if (this.view == 1) {
                this.espressoMachine.clearCoffeeBox();
            } else if (this.view == 2) {
                this.cappuccinoMachine.clearCoffeeBox();
            } else if (this.view == 3) {
                this.compactMachine.clearCoffeeBox();
            }
        } else if (str.contains("вода")) {
            if (this.view == 1) {
                this.espressoMachine.replenishWater();
            } else if (this.view == 2) {
                this.cappuccinoMachine.replenishWater();
            } else if (this.view == 3) {
                this.compactMachine.replenishWater();
            }
        } else if (str.contains("кофе")) {
            if (this.view == 1) {
                this.espressoMachine.replenishCoffee();
            } else if (this.view == 2) {
                this.cappuccinoMachine.replenishCoffee();
            } else if (this.view == 3) {
                this.compactMachine.replenishCoffee();
            }
        } else if (str.contains("молоко")){
            if(this.view == 2){
                this.cappuccinoMachine.replenishMilk();
            } else if (this.view == 3){
                this.compactMachine.replenishMilk();
            }
        }
    }
}
