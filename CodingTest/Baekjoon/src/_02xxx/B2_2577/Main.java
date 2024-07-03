package _02xxx.B2_2577;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 1;
        for (int i=0;i < 3;i++){
            result *= Integer.parseInt(br.readLine());
        }

        int[] arr = new int[10];
        for (char val : String.valueOf(result).toCharArray()) {
            arr[val - '0']++;
        }

        for (int count : arr) {
            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
