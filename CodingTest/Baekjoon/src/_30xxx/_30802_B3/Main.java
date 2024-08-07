package _30xxx._30802_B3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    // 참가자 수

        int[] size = new int[6];              // 사이즈 별 티셔츠 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<6;i++){
            size[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());   // 한 묶음에 들어가는 티셔츠 개수
        int P = Integer.parseInt(st.nextToken());   // 한 묶음에 들어가는 펜 개수

        int tGroup = 0;
        for (int num : size) {
            tGroup  += (num + T - 1) / T;    // 티셔츠 묶음 개수 계산
        }
        System.out.println(tGroup);
        System.out.println(N / P + " " + N % P);
    }
}
