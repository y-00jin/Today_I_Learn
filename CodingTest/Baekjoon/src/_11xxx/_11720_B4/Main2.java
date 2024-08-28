package _11xxx._11720_B4;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        char[] arr = br.readLine().toCharArray();
        int sum =0;
        for(char num : arr){
            sum += num - 48;
        }
        System.out.println(sum);
    }
}
