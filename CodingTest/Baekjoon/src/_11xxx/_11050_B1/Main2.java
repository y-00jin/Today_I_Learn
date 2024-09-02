package _11xxx._11050_B1;

import java.io.*;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] D = new int[N + 1][N + 1];

        // 초기화
        for (int i = 0; i <= N; i++) {
            D[i][i] = 1;    // i개 중에 i개를 다 뽑으면 무조건 1개
            D[i][0] = 1;    // i개 중에 0개를 뽑으면 무조건 1개
            D[i][1] = i;    // i개 중에 1개를 뽑으면 i개
        }

        // 점화식으로 배열 완성
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                D[i][j] = D[i - 1][j] + D[i - 1][j - 1];
            }
        }
        System.out.println(D[N][K]);
    }
}
