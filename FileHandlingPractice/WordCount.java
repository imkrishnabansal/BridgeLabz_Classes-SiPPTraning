import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Map<String, Integer> wordMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("textfile.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordMap.put(word.toLowerCase(), wordMap.getOrDefault(word.toLowerCase(), 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        wordMap.entrySet().stream()
            .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
            .limit(5)
            .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
