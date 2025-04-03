package _02xxx._2178_S1_미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static boolean[][] visited;
    static int[][] arr;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];

        // 배열 초기화
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(line.charAt(i) + "");
            }
        }

        BFS(0, 0);
        System.out.println(arr[N - 1][M - 1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});

        while (!queue.isEmpty()) {
            int now[] = queue.poll();
            visited[i][j] = true;

            // 현재 위치에서 상하좌우 탐색
            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k]; // now[0] : 현재x값 -> 현재 x값에서 상하좌우 dx배열의 값을 더해줌
                int y = now[1] + dy[k]; // now[1] : 현재y값 -> 현재 y값에서 상하좌우 dy배열의 값을 더해줌

                // 유효 좌표 확인
                if (x >= 0 && y >= 0 && x < N && y < M) {     // 배열 overflow 확인
                    if (arr[x][y] != 0 && !visited[x][y]) {   // 방문 배열이면 안됨
                        visited[x][y] = true;
                        arr[x][y] = arr[now[0]][now[1]] + 1;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}
