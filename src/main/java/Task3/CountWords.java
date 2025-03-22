package Task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWords {
    public void countWords(String filePath) {
        File input = new File(filePath);
        Map<String, Integer> countWords = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(input))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\s+");
                for (String word : words) {
                    countWords.put(word, countWords.getOrDefault(word, 0) + 1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(countWords.entrySet());
        sorted.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String, Integer> entry : sorted) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
