package _11xxx._11050_B1;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int result = factorial(N) / (factorial(N - K) * factorial(K));
        System.out.println(result);
    }

    public static int factorial(int val) {
        if (val == 1 || val == 0)
            return 1;
        return val * factorial(val - 1);
    }
}
