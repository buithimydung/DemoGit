package Task1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyWordCountApp {

    public static final String fileName = "data/fit.txt"; // Change the file path accordingly

    private Map<String, Integer> map = new HashMap<>();

    public void loadData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split the line into words using whitespace as a delimiter

                for (String word : words) {
                    word = word.toLowerCase(); // Convert the word to lowercase for case-insensitive counting
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int countDistinct() {
        return map.size();
    }

    public void printWordCounts() {
        System.out.println("Word Counts:");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void printWordCountsAlphabet() {
        System.out.println("Word Counts in Alphabetical Order:");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    public static void main(String[] args) {
        MyWordCountApp wordCountApp = new MyWordCountApp();
        wordCountApp.loadData();
        System.out.println("Distinct Tokens: " + wordCountApp.countDistinct());
        wordCountApp.printWordCounts();
        wordCountApp.printWordCountsAlphabet();
    }
}