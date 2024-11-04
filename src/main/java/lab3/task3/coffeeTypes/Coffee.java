package lab3.task3.coffeeTypes;

import lab3.task3.enums.Intensity;

abstract public class Coffee {
    private Intensity intensity;
    private final String name = getClass().getSimpleName();

    public void printCoffeeDetails() {
        System.out.println("This is " + name);
        System.out.println("Intensity: " + intensity.name());
    }

    public Coffee(Intensity intensity) {
        this.intensity = intensity;
    }

    public Coffee() {}

    public Intensity getIntensity() {
        return intensity;
    }

    public void setIntensity(Intensity intensity) {
        this.intensity = intensity;
    }


    public String getName() {
        return this.name;
    }

}
