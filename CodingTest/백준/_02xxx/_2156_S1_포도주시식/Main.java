package _02xxx._2156_S1_포도주시식;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    // 잔 수
        int[] arr = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if (n == 1) {
            System.out.println(arr[0]);
            return;
        } else if (n == 2) {
            System.out.println(arr[0] + arr[1]);
            return;
        }

        dp[0] = arr[0];
        dp[1] = arr[0] + arr[1];
        dp[2] = Math.max(dp[1], Math.max(arr[0] + arr[2], arr[1] + arr[2])); // 0번째+1번째, 0번째+2번째, 1번째+2번째 중 가장 큰값

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(
                    dp[i - 1],
                    Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i])
            );
        }
        System.out.println(dp[n - 1]);
    }
}
