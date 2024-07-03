package _02xxx.B5_2475;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int result = 0;
        while (st.hasMoreTokens()){
            result += Math.pow(Double.parseDouble(st.nextToken()), 2);
        }
        System.out.println(result%10);
        br.close();
    }
}
