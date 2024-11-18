package lab3.task4.starbucks.internals;

import lab3.task4.starbucks.internals.coffeeTypes.enums.SyrupType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Barista {

    private final String name;

    public Barista(String name) {
        this.name = name;
    }

    public void showMenu() {
        System.out.println("Menu:");
        System.out.println("- Cappuccino");
        System.out.println("- Americano");
        System.out.println("- Syrup Cappuccino");
        System.out.println("- Pumpkin Spice Latte");
    }

    public void orderCoffee(String coffeeName) {
        Scanner scanner = new Scanner(System.in);

        // Check for favorite order
        if (Objects.equals(coffeeName, "Your favourite")) {
            coffeeName = "Cappuccino";
        }

        System.out.println("You have chosen: " + coffeeName);

        switch (coffeeName.toLowerCase()) {
            case "cappuccino":
                System.out.println("How much milk do you want in your Cappuccino (in ml)?");
                int milkVolumeCappuccino = scanner.nextInt();
                Cappuccino cappuccino = Cappuccino.makeCappuccino(milkVolumeCappuccino); // Use factory method
                break;

            case "americano":
                System.out.println("How much water do you want in your Americano (in ml)?");
                int waterVolumeAmericano = scanner.nextInt();
                Americano americano = Americano.makeAmericano(waterVolumeAmericano); // Use factory method
                break;

            case "syrup cappuccino":
                // Validate syrup selection
                List<String> validSyrups = getValidSyrupTypes();
                String syrupChoice = "";
                boolean validInput = false;

                while (!validInput) {
                    System.out.println("Which syrup would you like (e.g., Vanilla, Caramel)? " + validSyrups);
                    syrupChoice = scanner.next();

                    // Check if syrup is valid
                    if (validSyrups.contains(syrupChoice.toLowerCase())) {
                        validInput = true;
                    } else {
                        System.out.println("Invalid syrup choice. Please choose from: " + validSyrups);
                    }
                }

                SyrupCappuccino syrupCappuccino = SyrupCappuccino.makeSyrupCappuccino(150, SyrupType.valueOf(syrupChoice.toUpperCase())); // Use factory method
                System.out.println("Here is your " + syrupCappuccino.getName() + " with " + syrupChoice + " syrup ☕!");
                break;

            case "pumpkin spice latte":
                System.out.println("How much pumpkin spice would you like (in mg)?");
                int pumpkinSpiceMass = scanner.nextInt();
                PumpkinSpiceLatte pumpkinSpiceLatte = PumpkinSpiceLatte.makePumpkinSpiceLatte(pumpkinSpiceMass); // Use factory method
                System.out.println("Here is your " + pumpkinSpiceLatte.getName() + " ☕!");
                break;

            default:
                System.out.println("Sorry, we don't have " + coffeeName + " on the menu.");
                break;
        }
    }

    private List<String> getValidSyrupTypes() {
        List<String> syrups = new ArrayList<>();
        for (SyrupType syrup : SyrupType.values()) {
            syrups.add(syrup.name().toLowerCase());
        }
        return syrups;
    }

    public void present() {
        System.out.println("Hello, my name is " + name);
    }
}
