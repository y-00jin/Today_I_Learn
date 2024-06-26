package _02xxx.S5_2751;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        list.sort(null);
        for (Integer i : list) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
