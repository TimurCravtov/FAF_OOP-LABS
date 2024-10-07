package oop.practice;

import java.util.List;


public class Universe {
    private String name;
    private List<Classification> classifications;

    private List<Individual> individuals;

    public Universe() {}


    public Universe(String name, List<Classification> classifications, List<Individual> individuals) {
        this.name = name;
        this.classifications = classifications;
        this.individuals = individuals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Classification> getClassifications() {
        return classifications;
    }

    public void setClassifications(List<Classification> classifications) {
        this.classifications = classifications;
    }

    public List<Individual> getIndividuals() {
        return individuals;
    }

    public void setIndividuals(List<Individual> individuals) {
        this.individuals = individuals;
    }

    @Override
    public String toString() {
        // Create a formatted string for the classifications
        String classificationToString = String.join("\n",
                classifications.stream().map(Classification::toString).toArray(String[]::new));

        return String.format("------ Universe -------- \n" +
                "Name: %s, %d classifications:\n%s", name, classifications.size(), classificationToString);
    }
}

