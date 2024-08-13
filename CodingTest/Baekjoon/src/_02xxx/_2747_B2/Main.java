package _02xxx._2747_B2;

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num1 = 0;
        int num2 = 1;
        for(int i=0;i<=n-2;i++){
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num2);
    }
}
