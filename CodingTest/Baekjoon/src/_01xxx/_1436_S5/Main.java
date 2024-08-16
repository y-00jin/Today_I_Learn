package _01xxx._1436_S5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(br.readLine());

        int val = 666;
        int count = 1;
        while(N != count){
            val++;
            if(String.valueOf(val).contains("666")){
                count++;
            }
        }
        System.out.println(val);
    }
}
