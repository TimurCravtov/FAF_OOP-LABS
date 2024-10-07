package oop.practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    Universe starWars = new Universe("starwars", new ArrayList<>());
    Universe hitchhikers = new Universe("hitchhikers", new ArrayList<>());
    Universe marvel = new Universe("marvel", new ArrayList<>());
    Universe rings = new Universe("rings", new ArrayList<>());

    List<Universe> metaverse = new ArrayList<Universe>(List.of(starWars, hitchhikers, marvel, rings));

    IndividualJsonParsing individualJsonParsing = new IndividualJsonParsing();
    var individuals = individualJsonParsing.getIndividuals();

    individuals.forEach(System.out::println);
  }
}


