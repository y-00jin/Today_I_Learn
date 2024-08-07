package _04xxx._4153_B3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            for (int i = 0; i < arr.length; i++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i] = num * num;
            }
            Arrays.sort(arr);
            if (arr[0] + arr[1] + arr[2] == 0) { break; }

            String result = "wrong";
            if (arr[0] + arr[1] == arr[2]) {
                result = "right";
            }
            System.out.println(result);
        }
    }
}