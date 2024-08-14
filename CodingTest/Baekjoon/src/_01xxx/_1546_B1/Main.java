package _01xxx._1546_B1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] scores = new double[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<scores.length;i++){
            scores[i] = Double.parseDouble(st.nextToken());
        }

        double result = 0;
        for(double score : scores){
            result += score / Arrays.stream(scores).max().getAsDouble() * 100;
        }
        System.out.println(result / scores.length);
    }
}
