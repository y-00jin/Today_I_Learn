package _10xxx._10816_S4_숫자카드2;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());    // 상근이 숫자 카드 개수

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());
            Integer value = map.get(key);
            value = (value == null) ? 1 : ++value;
            map.put(key, value);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());
            Integer value = map.get(key);
            value = (value == null) ? 0 : value;
            sb.append(value + " ");
        }
        System.out.println(sb.toString().trim());
    }
}
