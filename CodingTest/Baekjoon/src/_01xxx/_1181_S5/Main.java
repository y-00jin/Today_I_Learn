package _01xxx._1181_S5;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<String>[] arr = new ArrayList[50];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            ArrayList<String> list = arr[str.length() - 1];
            if (!list.contains(str))
                list.add(str);
        }

        StringBuilder sb = new StringBuilder();
        for (ArrayList<String> list : arr) {
            if (!list.isEmpty()) {
                Collections.sort(list);
                for (String str : list) {
                    sb.append(str).append("\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
