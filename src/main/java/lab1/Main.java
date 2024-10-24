package lab1;

import lab1.enums.Traits;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Universe starWars = new Universe("starwars", new ArrayList<>(), new ArrayList<>());
        starWars.getClassifications().add(new Classification("Wookie", false, 400, "Kashyyyk",
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
                new ArrayList<>(List.of(Traits.BLONDE, Traits.POINTY_EARS, Traits.TALL))));
        rings.getClassifications().add(new Classification("Dwarf", true, 200, "Earth",
                new ArrayList<>(List.of(Traits.SHORT, Traits.BULKY))));


        Universe theVoid = new Universe("void",new ArrayList<>());

        List<Universe> metaverse = List.of(starWars, marvel, hitchhikers, rings, theVoid);

        metaverse.forEach(System.out::println);

        IndividualJsonParsing individualJsonParsing = new IndividualJsonParsing();
        var individuals = individualJsonParsing.getIndividuals();

        for (Individual individual : individuals) {

            Set<Universe> suitableUniverses = new HashSet<>();

            metaverse.forEach(universe -> {
                if (!"void".equals(universe.getName())) {
                    universe.getClassifications().forEach(classification -> {
                        if (classification.matches(individual)) {
                            suitableUniverses.add(universe);
                        }
                    });
                }
            });


            if (suitableUniverses.size() == 1) {
                Iterator<Universe> iterator = suitableUniverses.iterator();
                if (iterator.hasNext()) {
                    Universe universe = iterator.next();
                    universe.getIndividuals().add(individual);

                }
            }
            else {
                theVoid.getIndividuals().add(individual);
            }
        }

        IndividualJsonCreation individualJsonCreation = new IndividualJsonCreation(metaverse);
        individualJsonCreation.createJsonForUniverses();

    }
}
