package _01xxx._1271_B5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputValues = br.readLine();
        StringTokenizer st = new StringTokenizer(inputValues);

        BigInteger n = new BigInteger(st.nextToken()); // 최백준 조교가 가진 돈
        BigInteger m = new BigInteger(st.nextToken()); // 돈을 받으러 온 생명체 수

        BigInteger quotient = n.divide(m); // 생명체 하나에게 돌아가는 돈의 양
        BigInteger remainder = n.remainder(m); // 1원씩 분배할 수 없는 남는 돈

        System.out.println(quotient);
        System.out.println(remainder);

        br.close();
	}
}
