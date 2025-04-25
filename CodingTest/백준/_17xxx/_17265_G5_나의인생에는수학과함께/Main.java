package _17xxx._17265_G5_나의인생에는수학과함께;

import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {1, 0};   // 오른쪽, 아래만 확인
    static int[] dy = {0, 1};   // 오른쪽, 아래만 확인
    static int N;
    static char[][] arr;

    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = st.nextToken().charAt(0);
            }
        }
        dfs(0, 0, arr[0][0] - '0', ' ');
        System.out.println(max + " " + min);

    }

    private static void dfs(int nowX, int nowY, int sum, char op) {

        if (nowX == N - 1 && nowY == N - 1) { // 최종 목적지
            min = Math.min(min, sum);
            max = Math.max(max, sum);
            return;
        }

        for (int i = 0; i < 2; i++) {
            int newX = nowX + dx[i];
            int newY = nowY + dy[i];

            if (newX >= N || newY >= N) continue;

            char nextVal = arr[newY][newX];

            if (Character.isDigit(nextVal)) {
                int num = nextVal - '0';
                int newSum = calculate(sum, num, op);
                dfs(newX, newY, newSum, ' ');  // 다음 op는 비워놓고
            } else {
                dfs(newX, newY, sum, nextVal);  // 연산자는 그대로 넘김
            }
        }
    }

    private static int calculate(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            default: return a;
        }
    }
}
