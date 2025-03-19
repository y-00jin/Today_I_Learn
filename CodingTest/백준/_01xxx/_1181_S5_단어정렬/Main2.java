package _01xxx._1181_S5_단어정렬;

import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<Integer, Set<String>> words = new TreeMap<>();
        while (N-- > 0) {
            String word = br.readLine();
            words.computeIfAbsent(word.length(), k -> new TreeSet<>()).add(word);
        }

        words.values().forEach(set -> set.forEach(System.out::println));
    }
}
