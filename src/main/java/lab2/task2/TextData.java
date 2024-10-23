package lab2.task2;

import lab2.task1.Colors;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class TextData {
    private String fileName;
    private final String text;
    private Integer numberOfVowels;
    private Integer numberOfLetters;
    private Integer numberOfSentences;
    private Integer numberOfConsonants;
    private String longestWord;

    public TextData(String text, String path) {
        Path filePath = Paths.get(path);
        String fileName = filePath.getFileName().toString();

        this.text = text;
        this.fileName = fileName;

    }

    public String getFileName() {
        return fileName;
    }

    public String getText() {
        return text;
    }

    public int getNumberOfVowels() {

        if (this.numberOfVowels == null) {

            List<Character> VOWELS = new ArrayList<>(List.of('a', 'o', 'u', 'i', 'e'));
            numberOfVowels = (int) text.chars().mapToObj(c -> Character.toLowerCase((char) c)).filter(VOWELS::contains).count();

        }
        return numberOfVowels;
    }

    public int getNumberOfLetters() {

        if (this.numberOfLetters == null) {
            numberOfLetters = (int) text.chars().filter(Character::isLetter).count();
        }
        return numberOfLetters;
    }

    public int getNumberOfSentences() {
        if (numberOfSentences == null) {
            String[] sentences = text.trim().split("[.?!~]+\\s*");

            numberOfSentences = (int) Arrays.stream(sentences)
                    .filter(sentence -> !sentence.trim().isEmpty())
                    .count();
        }

        return numberOfSentences;
    }

    public int getNumberOfConsonants() {
        if (numberOfConsonants == null) {
            numberOfConsonants = getNumberOfLetters() - getNumberOfVowels();
        }
        return numberOfConsonants;
    }

    public String getLongestWord() {

        if (longestWord == null) {
            String[] words = text.split("[.\\n?!~;\\s]+");

            Optional<String> longestWord = Arrays.stream(words)
                    .max(Comparator.comparingInt(String::length));

            return longestWord.orElse("");
        }

        return longestWord;
    }

    @Override
    public String toString() {
        return text;
    }

    /**
     * @param maxChars: maximum chars for displaying. Pass -1 to get full text.
     * @return Pretty Formatted string
     * This function calculates all the necessary fields for given TextData object.
     */
    public String toStringPretty(int maxChars) {

        String output = String.format("File: " + Colors.BLUE + "%s\n" + Colors.RESET, fileName);

        if (maxChars == -1 || this.text.length() <= maxChars) output += String.format("%s\n", this.text);
        else output += String.format("%s...\n", this.text.substring(0, maxChars));

        output += String.format("Number of Letters: %d, where Vowels: %d and Consonants: %d\n",
                getNumberOfLetters(),
                getNumberOfVowels(),
                getNumberOfConsonants());
        output += String.format("Number of sentences: %d\n", getNumberOfSentences());
        output += String.format("The longest word: %s\n", getLongestWord());

        return output;
    }
}
