package _11xxx._11866_S4_요세푸스문제;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) queue.offer(i);


        StringBuilder sb = new StringBuilder("<");
        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) queue.offer(queue.poll());
            sb.append(queue.poll());
            if (!queue.isEmpty()) sb.append(", ");
        }

        sb.append(">");
        System.out.println(sb);
    }
}
