package lab3.task3;

import lab3.task3.coffeeTypes.Americano;
import lab3.task3.coffeeTypes.Cappuccino;
import lab3.task3.coffeeTypes.PumpkinSpiceLatte;
import lab3.task3.coffeeTypes.SyrupCappuccino;
import lab3.task3.enums.Intensity;
import lab3.task3.enums.SyrupType;

public class Main {
    public static void main(String[] args) {
        PumpkinSpiceLatte pumpkinSpiceLatte = PumpkinSpiceLatte.makePumpkinSpiceLatte();
        pumpkinSpiceLatte.printCoffeeDetails();
    }
}
