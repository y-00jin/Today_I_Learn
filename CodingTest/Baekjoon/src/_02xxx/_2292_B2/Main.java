package _02xxx._2292_B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int limit = 1;

        while (limit < N) {
            limit += 6 * count++;
        }
        System.out.println(count);
    }
}
