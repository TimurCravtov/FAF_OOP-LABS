package lab3.task4.starbucks.internals;

import lab3.task4.starbucks.internals.coffeeTypes.enums.Intensity;

class Americano extends Coffee {
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

    public static Americano makeAmericano(int waterVolumeAmericano) {
        Intensity defaultAmericanoIntensity = Intensity.STRONG;
        int defaultWaterVolume = 200;
        Americano americano = new Americano(defaultAmericanoIntensity, defaultWaterVolume);
        System.out.println("Preparing for you Americano");
        System.out.println("Intensity set to " + defaultAmericanoIntensity.name());
        System.out.println("Adding water: " + defaultWaterVolume);
        System.out.println("Here is your americano \uD83E\uDEF4☕ " + americano.hashCode());
        return americano;
    }

}
