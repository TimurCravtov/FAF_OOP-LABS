package lab3.task2.coffeeTypes;

import lab3.task2.enums.Intensity;

public class Americano extends Coffee {
    private int waterVolume;

    public Americano (Intensity intensity, int waterVolume) {
        super(intensity);
        this.waterVolume = waterVolume;
    }


    public int getWaterVolume() {
        return waterVolume;
    }

    public void setWaterVolume(int waterVolume) {
        this.waterVolume = waterVolume;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Water volume: " + this.waterVolume + " ml");
    }

}
