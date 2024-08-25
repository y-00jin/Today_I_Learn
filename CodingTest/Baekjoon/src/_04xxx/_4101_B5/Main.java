package _04xxx._4101_B5;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)))
        {
            while(true){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(st.nextToken());
                int second = Integer.parseInt(st.nextToken());
                if (first == 0 && second == 0) break;

                bw.write(first > second ? "Yes\n" : "No\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
