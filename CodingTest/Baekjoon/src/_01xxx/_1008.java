package _01xxx;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.util.StringTokenizer;
public class _1008 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputValues = br.readLine();
		StringTokenizer st = new StringTokenizer(inputValues);
		Double a = Double.parseDouble(st.nextToken());
		Double b = Double.parseDouble(st.nextToken());
		System.out.println(a/b);
		br.close();
	}
}
