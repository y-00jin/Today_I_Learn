package _11xxx._11382_B5;


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long result = 0;
        while (st.hasMoreTokens()) {
            result += Long.parseLong(st.nextToken());
        }
        System.out.println(result);
    }
}
