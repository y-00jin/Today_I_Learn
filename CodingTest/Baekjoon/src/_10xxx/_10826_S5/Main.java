package _10xxx._10826_S5;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger[] arr = new BigInteger[n + 1];
        arr[0] = BigInteger.ZERO;
        for(int i=1; i <= n; i++){
            if(i == 1){
                arr[i] = BigInteger.ONE;
                continue;
            }
            arr[i] = arr[i-1].add(arr[i-2]);
        }
        System.out.println(arr[n]);
    }
}
