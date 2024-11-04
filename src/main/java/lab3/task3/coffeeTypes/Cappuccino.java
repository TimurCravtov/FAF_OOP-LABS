package lab3.task3.coffeeTypes;

import lab3.task3.enums.Intensity;

public class Cappuccino extends Coffee {

    /**
     * in milliliters
     */
    private int milkVolume;

    public Cappuccino(Intensity intensity, int milkVolume) {
        super(intensity);
        this.milkVolume = milkVolume;
    }

    public Cappuccino() {}

    void setMilkVolume(int milkVolume) {
        this.milkVolume = milkVolume;
    }

    int getMilkVolume() {
        return this.milkVolume;
    }

    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Milk volume: " + milkVolume + " ml");
    }


    public static Cappuccino makeCappuccino() {
        Intensity defaultCappuccinoIntensity = Intensity.NORMAL;
        int defaultMilkVolume = 150;

        Cappuccino cappuccino = new Cappuccino(defaultCappuccinoIntensity, defaultMilkVolume);

        System.out.println("Preparing your Cappuccino...");
        System.out.println("Intensity set to " + defaultCappuccinoIntensity.name());
        System.out.println("Adding milk: " + defaultMilkVolume + "ml");
        System.out.println("Here is your Cappuccino ☕ " + cappuccino.hashCode());

        return cappuccino;
    }
}
