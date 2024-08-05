package _02xxx._2884_B3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int totalM = (H == 0? 24:H) * 60 + M - 45;

        System.out.println((totalM / 60 == 24 ? 0 : totalM / 60) + " " + totalM % 60);
    }
}