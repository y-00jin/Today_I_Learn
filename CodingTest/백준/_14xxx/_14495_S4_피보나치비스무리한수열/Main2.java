package _14xxx._14495_S4_피보나치비스무리한수열;

import java.io.*;

public class Main2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n <= 3) {
            System.out.println(1);
            return;
        }

        long[] D = new long[n + 1];
        D[1] = D[2] = D[3] = 1;

        for (int i = 4; i <= n; i++) {
            D[i] = D[i - 1] + D[i - 3];
        }

        System.out.println(D[n]);

    }
}
