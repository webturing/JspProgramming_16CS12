package stl;

import java.util.Arrays;
import java.util.TreeMap;

public class P1221 {
    public static void main(String[] args) {
        String clause = "To know everything? 'is' to know nothing.";
        String[] words = clause.toLowerCase().split("\\W+");
        System.out.println(Arrays.asList(words));
        System.out.println(words.length);//7
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                int old = map.get(word);
                map.put(word, old + 1);
            }
        }
        for (String word : map.keySet()) {
            System.out.println(String.format("%s:%d", word, map.get(word)));
        }
    }
}
