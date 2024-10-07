package oop.practice;

import oop.practice.enums.Traits;

import java.util.ArrayList;

public class Classification {

    private String name;

    private Boolean isHumanoid;
    private Integer maxAge;
    private String planet;
    private ArrayList<Traits> traits;

    // Constructor
    public Classification(String name, Boolean isHumanoid, Integer maxAge, String planet, ArrayList<Traits> traits) {
        this.isHumanoid = isHumanoid;
        this.name = name;
        this.maxAge = maxAge;
        this.planet = planet;
        this.traits = traits;
    }

    // Getters
    public Boolean getIsHumanoid() {
        return isHumanoid;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPlanet() {
        return planet;
    }

    public ArrayList<Traits> getTraits() {
        return traits;
    }

    // Setters
    public void setIsHumanoid(Boolean isHumanoid) {
        this.isHumanoid = isHumanoid;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public void setTraits(ArrayList<Traits> traits) {
        this.traits = traits;
    }

    @Override
    public String toString() {
        String traitsString = String.join(", ",
                traits.stream().map(Enum::name).toArray(String[]::new));

        return String.format("- Name: %s; isHumanoid: %s; planet: %s; age: %s; traits: %s",
                name,
                isHumanoid,
                planet,
                maxAge,
                traitsString);
    }

}