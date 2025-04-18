package _17xxx._17271_S2_리그오브레전설;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 싸움 시간
        int M = Integer.parseInt(st.nextToken());   // B 스킬 사전시간

        long[] dp = new long[N+1];
        dp[0] = 1;  // 0초를 만들수 있는 조합 1개

        for (int i = 1; i <= N; i++) {
            dp[i] = dp[i - 1];  // A 스킬 사용
            if (i >= M) {
                dp[i] = (dp[i] + dp[i - M]) % 1000000007;   // B스킬 사용 -> M초전 조합 + B
            }
        }
        System.out.println(dp[N]);
    }
}
