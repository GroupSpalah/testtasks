package all;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public Map<String, Integer> countWords(String s) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = s.split(" ");
        for (String word : words) {
            if (map.containsKey(word)) {
                Integer count = map.get(word);
                map.put(word, ++count);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        CountWords countWords = new CountWords();
        Map<String, Integer> map = countWords.countWords("String Hello Hello World World Again Try String Hello World Again Try");
        for (String word : map.keySet()) {
            System.out.println("The " + word + " word meets " + map.get(word) + " times");
        }
    }
}
