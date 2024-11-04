package lab3.task4;

import lab3.task4.starbucks.internals.Barista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Barista barista = new Barista("Jeffry");
        barista.present();
        barista.showMenu();

        Scanner scanner = new Scanner(System.in);
        String coffeeOrder;

        while (true) {
            System.out.print("Please enter the name of the coffee you'd like to order (or press Enter to finish): ");
            coffeeOrder = scanner.nextLine().trim();

            if (coffeeOrder.isEmpty()) {
                System.out.println("Thank you for visiting! Goodbye!");
                break;
            }

            barista.orderCoffee(coffeeOrder);
        }

        scanner.close();
    }
}
