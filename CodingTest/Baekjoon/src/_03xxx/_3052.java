package _03xxx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<10;i++){
            int num = Integer.parseInt(br.readLine()) % 42;
            if(arr.indexOf(num) == -1){
                arr.add(num);
            }
        }
        System.out.println(arr.size());
    }
}
