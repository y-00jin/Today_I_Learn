package _16xxx._16401_S2_과자나눠주기;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());   // 조카 수
        int N = Integer.parseInt(st.nextToken());   // 과자 수

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        int max = 0;    // 최대 길이
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        int left = 1;       // 범위 최소값
        int right = max;    // 범위 최대값
        int result = 0;     // 결과

        while (left <= right) {
            int mid = (left + right) / 2;   // 중간값

            int count = 0;
            for (int i = 0; i < N; i++) {
                count += arr[i] / mid;  // 몇명한테 줄 수 있는지
            }

            if (M <= count) {   // 줄 수 있는 조카 수가 많거나 같은 경우
                result = mid;
                left = mid + 1;
            } else {            // 줄 수 있는 조카 수가 더 적은 경우 => 과자 길이를 짧게
                right = mid - 1;
            }
        }
        System.out.println(result);
    }
}
