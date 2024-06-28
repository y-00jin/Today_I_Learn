package _02xxx.B5_2438;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            sb.append(String.join("", Collections.nCopies(i, "*")) + "\n");
        }
        System.out.println(sb);
        br.close();
    }
}
