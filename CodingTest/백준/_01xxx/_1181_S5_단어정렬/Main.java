package _01xxx._1181_S5_단어정렬;


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];

        for(int i=0;i < N;i++){
            str[i] = br.readLine(); // 입력한 단어 저장
        }

        Arrays.sort(str, Comparator.comparingInt(String::length).thenComparing(String::compareTo)); // 길이순 정렬 -> 길이가 같으면 사전순 정렬
        StringBuilder sb = new StringBuilder();
        sb.append(str[0]).append("\n");

        for (int i = 1; i < N; i++) {
            if (!str[i].equals(str[i - 1])) {
                sb.append(str[i]).append("\n");
            }
        }
        System.out.println(sb);

    }
}
