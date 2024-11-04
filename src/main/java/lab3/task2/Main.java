package lab3.task2;

import lab3.task2.coffeeTypes.Americano;
import lab3.task2.coffeeTypes.Cappuccino;
import lab3.task2.coffeeTypes.SyrupCappuccino;
import lab3.task2.enums.Intensity;
import lab3.task2.enums.SyrupType;

public class Main {
    public static void main(String[] args) {
        Cappuccino c = new SyrupCappuccino(Intensity.NORMAL, 100, SyrupType.CHOCOLATE);
        c.printCoffeeDetails();
        System.out.println();
        Americano a = new Americano(Intensity.STRONG, 300);
        a.printCoffeeDetails();

    }
}
