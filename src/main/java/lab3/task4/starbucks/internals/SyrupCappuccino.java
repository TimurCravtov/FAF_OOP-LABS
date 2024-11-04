package lab3.task4.starbucks.internals;

import lab3.task4.starbucks.internals.coffeeTypes.enums.Intensity;
import lab3.task4.starbucks.internals.coffeeTypes.enums.SyrupType;

class SyrupCappuccino extends Cappuccino {
    private SyrupType syrupType;

    public SyrupCappuccino(Intensity intensity, int milkVolume, SyrupType syrupType) {
        super(intensity, milkVolume);
        this.syrupType = syrupType;
    }

    public SyrupType getSyrupType() {
        return syrupType;
    }

    public void setSyrupType(SyrupType syrupType) {
        this.syrupType = syrupType;
    }

    @Override
    public final void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("With " + syrupType.name() + " syrup");
    }

    public static SyrupCappuccino makeSyrupCappuccino(int i, SyrupType syrupType) {
        Intensity defaultIntensity = Intensity.NORMAL;
        int defaultMilkVolume = 150;

        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(defaultIntensity, defaultMilkVolume, syrupType);

        System.out.println("Preparing your Syrup Cappuccino...");
        System.out.println("Intensity set to " + defaultIntensity.name());
        System.out.println("Adding milk: " + defaultMilkVolume + "ml");
        System.out.println("Syrup type: " + syrupType.name());
        System.out.println("Here is your Syrup Cappuccino ☕ " + syrupCappuccino.hashCode());

        return syrupCappuccino;
    }
}
