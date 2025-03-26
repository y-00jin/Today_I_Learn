package _01xxx._1259_B1_팰린드롬수;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){

            String num = br.readLine();
            if("0".equals(num)) break;

            boolean check = true;
            for (int i = 0, len = num.length(); i < len / 2; i++) {
                if (num.charAt(i) != num.charAt(len - 1 - i)) {
                    check = false;
                    break;
                }
            }
            sb.append(check ? "yes\n" : "no\n");
        }
        System.out.println(sb);
    }
}
