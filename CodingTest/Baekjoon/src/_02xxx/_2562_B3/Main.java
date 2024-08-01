package _02xxx._2562_B3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE ;
        for(int i=0;i<9;i++){
            int num = Integer.parseInt(br.readLine());
            list.add(num);
            max = max < num ? num : max;
        }
        System.out.println(max);
        System.out.println(list.indexOf(max) + 1);
    }
}
