package _02xxx._2018_S5_수들의합5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int startIndex = 1;
        int endIndex = 1;
        int count = 1;
        int sum = 1;
        while (endIndex != n){
            if(sum == n){
                count++;
                endIndex++;
                sum += endIndex;
            } else if(sum < n){
                endIndex++;
                sum += endIndex;
            } else{
                sum -= startIndex;
                startIndex++;
            }
        }
        System.out.println(count);
    }
}
