package _10xxx._10798_B1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] words = new String[15];
        Arrays.fill(words, "");

        int num = 5;
        while (num-- > 0) {
            String str = br.readLine();
            for (int i = 0; i < str.length(); i++) {
                words[i] = (words[i] == null ? "" : words[i]) + str.charAt(i);
            }
        }

        for (String word : words) {
            sb.append(word);
        }
        System.out.println(sb);
    }
}
