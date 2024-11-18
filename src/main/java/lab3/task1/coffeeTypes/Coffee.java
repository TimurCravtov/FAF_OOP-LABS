package lab3.task1.coffeeTypes;

import lab3.task1.enums.Intensity;

abstract public class Coffee {
    private Intensity intensity;
    private final String name = getClass().getSimpleName();

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
