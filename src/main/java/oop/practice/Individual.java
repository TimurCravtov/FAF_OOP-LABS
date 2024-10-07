package oop.practice;

import oop.practice.enums.Traits;

import java.util.List;

public class Individual {
    private Integer id;
    private Boolean isHumanoid;
    private Integer age;
    private String planet;

    private List<Traits> traits;

    public Individual() {}

    public Individual(Integer id, Boolean isHumanoid, Integer age, String planet, List<Traits> traits) {
        this.id = id;
        this.isHumanoid = isHumanoid;
        this.age = age;
        this.planet = planet;
        this.traits = traits;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean isHumanoid() {
        return isHumanoid;
    }

    public void setHumanoid(Boolean isHumanoid) {
        this.isHumanoid = isHumanoid;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public List<Traits> getTraits() {
        return traits;
    }

    public void setTraits(List<Traits> traits) {
        this.traits = traits;
    }

    @Override
    public String toString() {
        return String.format("Individual: id: %s, isHumanoid: %s, age: %s, planet: %s",
                id, isHumanoid, age, planet);
    }
}
