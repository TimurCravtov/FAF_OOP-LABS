package lab3.task1.coffeeTypes;

import lab3.task1.enums.Intensity;

public class Americano extends Coffee {
    private int waterVolume;

    public Americano (Intensity intensity,  int waterVolume) {
        super(intensity);
        this.waterVolume = waterVolume;
    }

    public int getWaterVolume() {
        return waterVolume;
    }

    public void setWaterVolume(int waterVolume) {
        this.waterVolume = waterVolume;
    }
}
