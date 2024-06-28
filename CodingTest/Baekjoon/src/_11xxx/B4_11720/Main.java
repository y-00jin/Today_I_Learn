package _11xxx.B4_11720;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    // 숫자의 개수
        String input = br.readLine();
        int result = 0;
        for(int i=0;i<N;i++){
            result += Integer.parseInt(input.substring(i, i+1));
        }
        System.out.println(result);
        br.close();
    }
}
