package lv1._신규아이디추천;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution s = new Solution();
        System.out.println(s.solution(br.readLine()));
    }
}

class Solution {
    public String solution(String new_id) {

        // 1단계: 소문자로 치환
        String answer = new_id.toLowerCase();

        // 2단계: 허용되지 않은 문자 제거
        StringBuilder sb = new StringBuilder();
        for (char c : answer.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                sb.append(c);
            }
        }
        answer = sb.toString();

        // 3단계: 마침표(.)가 2번 이상 연속된 부분을 하나로 치환
        while (answer.contains("..")) {
            answer = answer.replace("..", ".");
        }

        // 4단계: 처음과 끝의 마침표(.) 제거
        if (!answer.isEmpty() && answer.charAt(0) == '.') {
            answer = answer.substring(1);
        }
        if (!answer.isEmpty() && answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }

        // 5단계: 빈 문자열이면 "a" 대입
        if (answer.isEmpty()) {
            answer = "a";
        }

        // 6단계: 길이가 16자 이상이면 15자까지 자르고, 끝이 마침표면 제거
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            if (answer.charAt(14) == '.') {
                answer = answer.substring(0, 14);
            }
        }

        // 7단계: 길이가 2자 이하라면 마지막 문자를 반복해서 길이 3으로 맞춤
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }

        return answer;
    }
}
