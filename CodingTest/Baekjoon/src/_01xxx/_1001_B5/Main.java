package _01xxx._1001_B5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] agrs) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputValues = br.readLine();
		StringTokenizer st = new StringTokenizer(inputValues);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println(a-b);
		br.close();
	}
}
