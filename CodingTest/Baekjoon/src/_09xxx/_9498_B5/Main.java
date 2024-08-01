package _09xxx._9498_B5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String result ="";
        switch (num / 10){
            case 10:  case 9:
                result = "A"; break;
            case 8:
                result = "B"; break;
            case 7:
                result = "C"; break;
            case 6:
                result = "D"; break;
            default:
                result = "F"; break;
        }
        System.out.println(result);
    }
}
