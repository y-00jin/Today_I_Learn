package _01xxx._1157_B1_단어공부;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();

        int[] wordCount = new int[26];

        int max = 0;
        char resultWord = '?';

        for (char c : word.toCharArray()) {
            int idx = c - 'A';  // A를 0부터 시작하는 인덱스로 변환
            wordCount[idx]++;   // 해당 문자 개수 +1

            if (wordCount[idx] > max) { // 현재 문자의 개수가 최대값보다 큰경우
                max = wordCount[idx];
                resultWord = c;
            } else if (wordCount[idx] == max) { // 최댓값과 동일한 개수를 가진 문자가 나온 경우
                resultWord = '?';
            }
        }
        System.out.println(resultWord);
    }
}
