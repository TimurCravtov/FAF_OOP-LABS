package lab3.task1.coffeeTypes;

import lab3.task1.coffeeTypes.Cappuccino;
import lab3.task1.enums.Intensity;

public class PumpkinSpiceLatte extends Cappuccino {

    /**
     * In mg
     */
    private int pumpkinSpiceMass;

    public PumpkinSpiceLatte(Intensity intensity, int milkVolume, int pumpkinSpiceMass) {
        super(intensity, milkVolume);
        this.pumpkinSpiceMass = pumpkinSpiceMass;
    }

    public PumpkinSpiceLatte() {}


    public int getPumpkinSpiceMass() {
        return pumpkinSpiceMass;
    }

    public void setPumpkinSpiceMass(int pumpkinSpiceMass) {
        this.pumpkinSpiceMass = pumpkinSpiceMass;
    }
}
