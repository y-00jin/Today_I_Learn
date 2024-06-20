package _02xxx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;

public class _2439 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		for (int i = 1; i <= count; i++) {
			String result = String.join("", Collections.nCopies(count - i, " ")).concat(String.join("", Collections.nCopies(i, "*")));
			System.out.println(result);
		}
	}
}
