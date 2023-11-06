package Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MyWordCount {
    public static final String fileName = "data/fit.txt";
    private Map<String, Integer> wordCountMap = new HashMap<>();

    public MyWordCount() {
        try {
            List<String> words = readWordsFromFile(fileName);
            countWords(words);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> readWordsFromFile(String fileName) throws IOException {
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words using space as a delimiter
                String[] lineWords = line.split(" ");
                words.addAll(Arrays.asList(lineWords));
            }
        }
        return words;
    }

    private void countWords(List<String> words) {
        for (String word : words) {
            // Remove punctuation and convert to lowercase for consistency
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
    }

    public static void main(String[] args) {
        MyWordCount wordCounter = new MyWordCount();

        for (Map.Entry<String, Integer> entry : wordCounter.wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
	