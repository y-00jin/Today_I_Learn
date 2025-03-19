package _01xxx._1181_S5_단어정렬;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<Integer, List<String>> words = new HashMap<>();
        while(N-- > 0){
            String word = br.readLine();
            int key = word.length();

            if(!words.containsKey(key))
                words.put(key, new ArrayList<>());

            if(!words.get(key).contains(word))
                words.get(key).add(word);
        }

        List<Integer> keySet = new ArrayList<>(words.keySet());
        Collections.sort(keySet);
        for (int key : keySet) {
            List<String> values = words.get(key);
            Collections.sort(values);

            for(String value : values){
                System.out.println(value);
            }
        }
    }
}
