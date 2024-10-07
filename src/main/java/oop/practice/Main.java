package oop.practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import oop.practice.enums.Traits;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Universe starWars = new Universe("starwars", new ArrayList<>(), new ArrayList<>());
        starWars.getClassifications().add(new Classification("Wookie", false, 400, "Kashyyk",
                new ArrayList<>(List.of(Traits.HAIRY, Traits.TALL))));
        starWars.getClassifications().add(new Classification("Ewok", false, 60, "Endor",
                new ArrayList<>(List.of(Traits.SHORT, Traits.HAIRY))));

        Universe marvel = new Universe("marvel", new ArrayList<>(), new ArrayList<>());
        marvel.getClassifications().add(new Classification("Asgardian", true, 5000, "Asgard",
                new ArrayList<>(List.of(Traits.BLONDE, Traits.TALL))));

        Universe hitchhikers = new Universe("hitchhikers", new ArrayList<>(), new ArrayList<>());
        hitchhikers.getClassifications().add(new Classification("Betelgeusian", true, 100, "Betelgeuse",
                new ArrayList<>(List.of(Traits.EXTRA_ARMS, Traits.EXTRA_HEAD))));
        hitchhikers.getClassifications().add(new Classification("Vogons", false, 200, "Vogsphere",
                new ArrayList<>(List.of(Traits.GREEN, Traits.BULKY))));

        Universe rings = new Universe("rings", new ArrayList<>(), new ArrayList<>());
        rings.getClassifications().add(new Classification("Elf", true, Integer.MAX_VALUE, "Earth",
                new ArrayList<>(List.of(Traits.BLONDE, Traits.POINTY_EARS))));
        rings.getClassifications().add(new Classification("Dwarf", true, 200, "Earth",
                new ArrayList<>(List.of(Traits.SHORT, Traits.BULKY))));

        List<Universe> metaverse = List.of(starWars, marvel, hitchhikers, rings);

        metaverse.forEach(System.out::println);

        IndividualJsonParsing individualJsonParsing = new IndividualJsonParsing();
        var individuals = individualJsonParsing.getIndividuals();

        for (Individual individual : individuals) {

            Set<Universe> suitableUniverses = new HashSet<>();

            metaverse.forEach
                    (universe -> universe.getClassifications().forEach(classification -> {
                        if (classification.matches(individual)) suitableUniverses.add(universe);
                    }));

            System.out.println(individual);
            suitableUniverses.forEach((universe -> System.out.println(universe.getName())));

        }
    }
}
