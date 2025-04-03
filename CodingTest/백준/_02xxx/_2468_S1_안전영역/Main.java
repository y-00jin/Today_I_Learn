package _02xxx._2468_S1_안전영역;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static boolean[][] visited; // 방문 배열
    static int[][] arr;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];    // 배열 생성

        // 값 초기화
        int maxHeight = 0;  // 최대 높이값
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, arr[i][j]);
            }
        }

        // 높이 0부터 최대 높이까지 순회하며 최대 안전 영역 개수 출력
        int maxArea = 0;
        for(int h=0;h<=maxHeight;h++){

            visited = new boolean[n][n];    // 배열 생성

            int count = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(!visited[i][j] && arr[i][j] > h ) {   // 방문 노드가 아니면서 지역 높이가 h보다 큰 경우 탐색 시작
                        count += DFS(i, j, h);
                    }
                }
            }
            maxArea = Math.max(maxArea, count);
        }
        System.out.println(maxArea);
    }

    private static int DFS(int x, int y, int h) {
        visited[x][y] = true;   //방문 체크

        // 상 하 좌 우 체크
        for(int i=0; i<4;i++){
            int newX = x + dx[i];
            int newY = y + dy[i];

            if(!(newX >= 0 && newY >= 0 && newX < n && newY < n) ) continue;    // 배열 범위를 벗어나면 continue;
            if(!visited[newX][newY] && arr[newX][newY] > h) DFS(newX, newY, h); // 다음 노드가 방문하지 않았고 높이 h보다 크면 다음 탐색
        }

        return 1;   // 최종적으로 탐색이 끝나면 하나의 안전 영역
    }
}
