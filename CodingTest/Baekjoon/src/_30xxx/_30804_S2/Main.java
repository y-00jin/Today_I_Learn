package _30xxx._30804_S2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] check = new int[10];  // 과일 종류별 개수(0은 무시)
        Deque<Integer> S = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(st.nextToken());
            S.add(val);
            check[val]++;   // 해당하는 과일 종류에 +1
        }

        for (int i = 0; i < N; i++) {   // 값 제거
            long nonZeroCount = Arrays.stream(check)
                    .filter(value -> value != 0)
                    .count();
            if (nonZeroCount <= 2) {
                break;
            }

            int removeFirst = S.removeFirst();
            check[removeFirst]--;

            long nonZeroCount2 = Arrays.stream(check)
                    .filter(value -> value != 0)
                    .count();
            if (nonZeroCount2 <= 2) {
                break;
            }
            int removeLast = S.removeLast();
            check[removeLast]--;
        }

        int sum = Arrays.stream(check)
                .filter(value -> value != 0)
                .sum();
        System.out.println(sum);
    }
}
