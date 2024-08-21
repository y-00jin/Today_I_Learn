package _02xxx._2775_B1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[15][15];
        for(int i = 0; i < 15; i++) {
            arr[i][1] = 1;	// i층 1호
            arr[0][i] = i;	// 0층 i호
        }



        int N = Integer.parseInt(br.readLine());


    }
}
