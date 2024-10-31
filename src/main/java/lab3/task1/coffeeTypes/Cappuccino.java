package lab3.task1.coffeeTypes;

import lab3.task1.enums.Intensity;

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

}
