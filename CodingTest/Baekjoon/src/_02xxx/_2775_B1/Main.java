package _02xxx._2775_B1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[15][15];
        for (int i = 0; i < 15; i++) {
            arr[i][1] = 1;    // i층 1호
            arr[0][i] = i;    // 0층 i호
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(arr[k][n] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
