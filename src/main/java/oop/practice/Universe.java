package oop.practice;

import java.util.List;
import java.util.Objects;


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

    public Universe(String name, List<Individual> individuals) {
        this.name = name;
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
        String classificationToString;

        // Check if classifications is null and provide default value if necessary
        if (classifications == null) {
            classificationToString = "No classifications\n";
        } else {
            classificationToString = String.join("\n",
                    classifications.stream()
                            .filter(Objects::nonNull) // Handle possible null classifications
                            .map(Classification::toString)
                            .toArray(String[]::new)
            );
        }

        // Format the output string with the universe details
        return String.format("------ Universe -------- \n" +
                        "Name: %s, %d classifications:\n%s", name,
                classifications != null ? classifications.size() : 0,
                classificationToString);
    }

}

