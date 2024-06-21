package _08xxx.B2_8958;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopCount = Integer.parseInt(br.readLine());    // 반복 횟수

        for (int i = 0; i < loopCount; i++) {
            String oxResults = br.readLine();
            int score = 0;
            int preScore = 0;

            for (int j = 0; j < oxResults.length(); j++) {
                if ('O' == oxResults.charAt(j)) {
                    preScore = (preScore > 0) ? ++preScore : 1;
                } else{
                    preScore = 0;
                }
                score += preScore;
            }
            System.out.println(score);
        }
    }
}
