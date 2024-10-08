package oop.practice;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IndividualJsonParsing {

    public final String INPUT_PATH = "src/main/resources/input.json";

    // Inner class to represent the JSON structure
    static class IndividualData {
        public List<Individual> data;

        public List<Individual> getData() {
            return data;
        }
    }

    public List<Individual> getIndividuals() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Individual> individuals = new ArrayList<>();

        try {
            // Read the JSON file into the IndividualData object
            IndividualData individualData = objectMapper.readValue(new File(INPUT_PATH), IndividualData.class);
            individuals = individualData.getData(); // Get the individuals list from the inner class
        } catch (IOException e) {
            e.fillInStackTrace(); // Handle exception appropriately
        }

        return individuals;
    }
}
