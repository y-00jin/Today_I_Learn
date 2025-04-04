package _02xxx._2559_S3_수열;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 전체 날짜 수
        int K = Integer.parseInt(st.nextToken());   // 연속적인 날짜 수

        int[] arr = new int[N];

        // 측정 온도 입력
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(i < K) sum += arr[i];    // k까지 합 먼저 구하기
        }

        int maxSum = sum;   // 최대 합
        for (int i = K; i < N; i++) {   // i : 가장 오른쪽 인덱스 (새롭게 추가되는 인덱스)
            int j = i - K;              // j : 가장 왼쪽 인덱스 (삭제되는 인덱스)

            sum += arr[i];  // 다음 인덱스 값 추가
            sum -= arr[j];  // 가장 앞 인덱스 값 삭제
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
