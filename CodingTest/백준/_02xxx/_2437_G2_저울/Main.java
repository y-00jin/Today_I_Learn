package _02xxx._2437_G2_저울;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i ++) {
            arr[i] =Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);   // 수 정렬
        int sum = 1;
        for(int num : arr){
            if(sum < num)
                break;
            else
                sum += num;
        }
        System.out.println(sum);
    }
}
