package _01xxx._1259_B1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int num = Integer.parseInt(br.readLine());
            if(num == 0) break;

            String numStr = String.valueOf(num);
            String rev = new StringBuilder(numStr).reverse().toString();
            bw.write(numStr.equals(rev) ? "yes\n" : "no\n");
        }

        bw.flush();
        bw.close();
    }
}
