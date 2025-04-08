package _10xxx._10799_S2_쇠막대기;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<Character> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else {
                stack.pop();

                if (str.charAt(i - 1) == '(') { // 레이저 -> 현재 스택에 남은 막대기 수만큼 잘림
                    result += stack.size();
                } else {    // 막대기 끝 -> ))
                    // 막대기 끝 -> 잘린 조각 +1
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
}

