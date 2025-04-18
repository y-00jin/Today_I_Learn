package _17xxx._17271_S2_리그오브레전설;

import java.io.*;
import java.util.*;

public class Main2 {

    static int[][] arr;
    static int N, M;
    static int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};  // 왼쪽 위부터 시계 방향
    static int[] dy = {-1, -1, -1, 0, 1, 1, 1, 0};  // 왼쪽 위부터 시계 방향
    static TreeSet<String> skill = new TreeSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());   // 싸움 시간
        M = Integer.parseInt(st.nextToken());   // B 스킬 사전시간
        arr = new int[2][N];

        // 초기화
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0)
                    arr[i][j] = 1;
                else
                    arr[i][j] = (j < N / M) ? M : -1;
            }
        }

        // 탐색
        for (int i = 0; i < 2; i++) {
            dfs(i, 0, arr[i][0], arr[i][0] == 1 ? "A" : "B");
        }

        System.out.println(skill.size() % 1000000007);
    }

    private static void dfs(int nowX, int nowY, int sum, String nowSkill) {

        if (sum == N) {
            skill.add(nowSkill);
            return;
        }

        if(arr[nowY][nowX] == -1){
            return;
        }

        // 모든 방향으로 탐색
        for (int i = 0; i < 8; i++) {
            int newX = nowX + dx[i];
            int newY = nowY + dy[i];

            if (newX < 0 || newX >= N || newY < 0 || newY >= 2 || sum > N) {
                continue;
            }

            int thisVal = arr[newY][newX];
            String newSkill = nowSkill + (thisVal == 1 ? "A" : "B");
            dfs(newX, newY, sum + thisVal, newSkill);
        }
    }
}
