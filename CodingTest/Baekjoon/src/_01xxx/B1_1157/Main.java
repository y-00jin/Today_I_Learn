package _01xxx.B1_1157;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toUpperCase();

		Map<Character, Integer> mapVal = new HashMap<>();
        for (char c : word.toCharArray()) {
            mapVal.put(c, mapVal.getOrDefault(c, 0) + 1);	// getOrDefault : 찾는 키가 존재하면 키 값 반환 없으면 기본값 반환
        }

		int max = 0;
		char maxWord = '?';
		for (Map.Entry<Character, Integer> entry : mapVal.entrySet()) {
            int wordCount = entry.getValue();
            if (wordCount > max) {	// 단어 수 비교
                max = wordCount;
                maxWord = entry.getKey();	// 키값 (단어)
            } else if (wordCount == max) {
                maxWord = '?';
            }
        }
		System.out.println(maxWord);
	}
}
