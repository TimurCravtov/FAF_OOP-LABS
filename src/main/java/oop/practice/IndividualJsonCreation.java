package oop.practice;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class IndividualJsonCreation {
    private final List<Universe> metaverse;
    private final String OUTPUT_PATH = "src/main/resources/output/mine/";

    public IndividualJsonCreation(List<Universe> metaverse) {
        this.metaverse = metaverse;
    }

    // Inner class representing the JSON structure (made static and added getters)
    public static class UniverseInner {
        private String name;
        private List<Individual> individuals;

        UniverseInner(Universe u) {
            this.name = u.getName();
            this.individuals = u.getIndividuals();
        }

        public String getName() {
            return name;
        }

        public List<Individual> getIndividuals() {
            return individuals;
        }
    }

    public void createJsonForUniverses() {
        ObjectMapper objectMapper = new ObjectMapper();

        for (Universe universe : metaverse) {
            UniverseInner universeInner = new UniverseInner(universe);

            String fileName = OUTPUT_PATH + universeInner.getName().toLowerCase().replace(" ", "_") + ".json";
            File outputFile = new File(fileName);
            outputFile.getParentFile().mkdirs();

            try {
                objectMapper.writerWithDefaultPrettyPrinter().writeValue(outputFile, universeInner);
                System.out.println("Created JSON file: " + fileName);
            } catch (IOException e) {
                System.err.println("Error writing file: " + fileName);
                e.printStackTrace();
            }
        }
    }
}
