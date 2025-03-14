package _01xxx._1000_B5_AB더하기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        // # BufferedReader 사용 -> 64초
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// INPUT
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(a + b);
        br.close();

        // # Scanner 사용 -> 112초
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println(a+b);
    }
}