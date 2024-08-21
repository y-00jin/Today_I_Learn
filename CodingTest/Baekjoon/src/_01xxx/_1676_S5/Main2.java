package _01xxx._1676_S5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger fac = factorial(BigInteger.valueOf(N));

        int count = 0;
        String strFac = String.valueOf(fac);
        for (int i = strFac.length() - 1; i >= 0; i--) {
            if (strFac.charAt(i) == '0') {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }

    public static BigInteger factorial(BigInteger val) {
        if (val.compareTo(BigInteger.ONE) <= 0) {
            return BigInteger.ONE;
        } else {
            return val.multiply(factorial(val.subtract(BigInteger.ONE)));
        }
    }
}
