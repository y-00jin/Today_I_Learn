package lv2._JadenCase문자열만들기;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution solution = new Solution();
        System.out.println(solution.solution(br.readLine()));
    }

    static class Solution {
        public String solution(String s) {

            StringBuilder sb = new StringBuilder();

            boolean isFirst = true;
            for (char c : s.toCharArray()) {
                if (isFirst)
                    sb.append(Character.toUpperCase(c));
                else
                    sb.append(Character.toLowerCase(c));

                isFirst = (c == ' ');
            }
            return sb.toString();
        }
    }
}



