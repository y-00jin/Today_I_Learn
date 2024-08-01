package _01xxx._1152_B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String words = br.readLine();
		StringTokenizer st = new StringTokenizer(words);
		System.out.println(st.countTokens());
	}
}
