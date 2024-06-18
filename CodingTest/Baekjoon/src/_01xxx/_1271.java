package _01xxx;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1271 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputValues = br.readLine();
		StringTokenizer st = new StringTokenizer(inputValues);
		int n = Integer.parseInt(st.nextToken());	// 돈
		int m = Integer.parseInt(st.nextToken());	// 돈을 받으러 온 생명체 수
		System.out.println(n/m);	// 생명체 하나에게 돌아가는 돈의 양
		System.out.println(n%m);	// 1원씩 분배할 수 없는 남는 돈
		br.close();
	}
}
