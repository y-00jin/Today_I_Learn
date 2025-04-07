package _04xxx._4963_S2_섬의개수;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};  // 왼쪽 위부터 시계 방향
    static int[] dy = {-1, -1, -1, 0, 1, 1, 1, 0};  // 왼쪽 위부터 시계 방향

    static boolean[][] check;
    static int[][] arr;
    static int w, h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) break;

            // 값 저장
            arr = new int[h][w];
            check = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;  // 탐색
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!check[i][j] && arr[i][j] == 1) {
                        count += DFS(i, j);
                    }
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int DFS(int y, int x) {
        check[y][x] = true; // 방문

        for (int i = 0; i < 8; i++) {   // 가로 세로 대각선 체크
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX < 0 || newY < 0 || newX >= w || newY >= h) continue;
            if(!check[newY][newX] && arr[newY][newX] == 1){
                DFS(newY, newX);
            }
        }
        return 1;
    }
}
