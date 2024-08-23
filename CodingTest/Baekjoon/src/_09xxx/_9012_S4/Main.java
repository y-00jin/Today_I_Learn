package _09xxx._9012_S4;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (char ch : br.readLine().toCharArray()) {
                if (ch == '(') {
                    stack.push(ch);
                } else if (stack.isEmpty()) {
                    isValid = false;
                    break;
                } else {
                    stack.pop();
                }
            }

            bw.write((isValid && stack.isEmpty()) ? "YES\n" : "NO\n");
        }
        bw.flush();
        bw.close();
    }
}
