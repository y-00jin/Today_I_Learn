package _27xxx._27971_S1_강아지는많을수록좋다;

import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static boolean[] visited;
    static int[] ab = new int[2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ab[0] = Integer.parseInt(st.nextToken());
        ab[1] = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {   // 금지 구간 설정
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            for (int j = l; j <= r; j++) {
                if (j <= N)
                    visited[j] = true;    // 금지 구간은 방문한 상태로 변경
            }
        }

        System.out.println(bfs());
    }

    private static int bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited[0] = true;

        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size(); // 현재 깊이에서의 노드 개수

            for (int i = 0; i < size; i++) {
                int now = queue.poll();

                if (now == N)
                    return steps;

                for (int add : ab) {
                    int next = now + add;
                    if (next <= N && !visited[next]) {
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
            }
            steps++;
        }
        return -1; // 도달 불가능
    }
}
