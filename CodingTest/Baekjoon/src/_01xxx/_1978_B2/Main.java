package _01xxx._1978_B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 수의 개수
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean[] isPrime = new boolean[1001];
        isPrime[0] = isPrime[1] = true;
        
        for (int i = 2; i <= 1000; i++) {
            if(!isPrime[i]){
                for (int j = i * i ; j <= 1000; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        int count = 0;
        while (st.hasMoreTokens()){
            if (!isPrime[Integer.parseInt(st.nextToken())]) count++;
        }
        System.out.println(count);
    }
}
