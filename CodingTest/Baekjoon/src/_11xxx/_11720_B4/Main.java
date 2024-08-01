package _11xxx._11720_B4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int result = 0;
        for(int i=0;i<N;i++){
            result += Integer.parseInt(input.substring(i, i+1));
        }
        System.out.println(result);
        br.close();
    }
}
