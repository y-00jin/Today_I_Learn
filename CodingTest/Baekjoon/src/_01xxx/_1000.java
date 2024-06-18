package _01xxx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1000 {
	public static void main(String[] args) throws Exception {

		// # BufferedReader 사용 -> 64초
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// INPUT
		String inputValues = br.readLine();
		StringTokenizer st = new StringTokenizer(inputValues);
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
