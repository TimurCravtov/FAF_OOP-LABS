package lab3.task2.coffeeTypes;

import lab3.task2.enums.Intensity;
import lab3.task2.enums.SyrupType;

public class SyrupCappuccino extends Cappuccino {
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

    public final void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("With " + syrupType.name() + " syrup");
    }
}
