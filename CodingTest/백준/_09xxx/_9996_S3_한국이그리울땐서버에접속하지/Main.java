package _09xxx._9996_S3_한국이그리울땐서버에접속하지;

import java.io.*;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), "*");

        String regex = "^" + st.nextToken() + ".*" + st.nextToken() + "$";

        for (int i = 0; i < n; i++) {
            if(Pattern.matches(regex, br.readLine()))
                bw.write("DA\n");
            else
                bw.write("NE\n");
        }
        bw.flush();
    }
}
