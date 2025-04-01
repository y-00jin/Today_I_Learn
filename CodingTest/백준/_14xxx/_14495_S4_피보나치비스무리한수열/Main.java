package _14xxx._14495_S4_피보나치비스무리한수열;

import java.io.*;

public class Main {

    static long[] D;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n <= 3) {
            System.out.println(1);
            return;
        }

        D = new long[n + 1];   // 수열 배열 생성
        D[1]=D[2]=D[3]=1;

        System.out.println(solution(n));
    }

    static long solution(int n) {
        if (D[n] != 0) return D[n];  // 아직 계산되지 않은 값
        return D[n] = solution(n - 1) + solution(n - 3);
    }
}
