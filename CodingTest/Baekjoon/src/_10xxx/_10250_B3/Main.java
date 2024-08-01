package _10xxx._10250_B3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopCount = Integer.parseInt(br.readLine());
        for(int i = 0 ; i<loopCount;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());   // 층 수
            int W = Integer.parseInt(st.nextToken());   // 각 층의 방 수
            int N = Integer.parseInt(st.nextToken());   // 몇 번째 손님

            int Y = N % H == 0 ? H : N % H;
            int X = N % H == 0 ? N / H : N / H + 1;
            System.out.printf("%d%02d%n",  Y, X);   // 형식에 맞춰 출력
        }
    }
}
