package _02xxx._2231_B2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        int start = Math.max(1, N - 9 * Integer.toString(N).length());
        for (int i = start; i < N; i++) {
            int sum = i;
            int temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
