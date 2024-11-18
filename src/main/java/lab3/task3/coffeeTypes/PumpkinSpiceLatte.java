package lab3.task3.coffeeTypes;

import lab3.task3.enums.Intensity;

public class PumpkinSpiceLatte extends Cappuccino {

    /**
     * In mg
     */
    private int pumpkinSpiceMass;

    public PumpkinSpiceLatte(Intensity intensity, int milkVolume, int pumpkinSpiceMass) {
        super(intensity, milkVolume);
        this.pumpkinSpiceMass = pumpkinSpiceMass;
    }

    public int getPumpkinSpiceMass() {
        return pumpkinSpiceMass;
    }

    public void setPumpkinSpiceMass(int pumpkinSpiceMass) {
        this.pumpkinSpiceMass = pumpkinSpiceMass;
    }

    public static PumpkinSpiceLatte makePumpkinSpiceLatte() {
        Intensity defaultIntensity = Intensity.NORMAL;
        int defaultMilkVolume = 150;
        int defaultPumpkinSpiceMass = 50;

        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(defaultIntensity, defaultMilkVolume, defaultPumpkinSpiceMass);

        System.out.println("Preparing your Pumpkin Spice Latte...");
        System.out.println("Intensity set to " + defaultIntensity.name());
        System.out.println("Adding milk: " + defaultMilkVolume + "ml");
        System.out.println("Adding pumpkin spice: " + defaultPumpkinSpiceMass + " mg");
        System.out.println("Here is your Pumpkin Spice Latte ☕ " + pumpkinSpiceLatte.hashCode());

        return pumpkinSpiceLatte;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Pumpkin Spice Mass: " + pumpkinSpiceMass + " mg");
    }
}
