package _01xxx._1929_S3_소수구하기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];   // 인덱스에 해당하는 수로 초기화하기 위해 +1 (0포함)

        for (int i = 0; i <= N; i++) {  // 1. 배열 초기화
            arr[i] = i;
        }

        arr[1] = 0; // 1은 소수가 아님
        for (int i = 2; i <= Math.sqrt(N); i++) {    // 2. 소수 구하기 -> 2부터 N의 제곱근까지
            if(arr[i] == 0) continue;   // 이미 제외된 수

            // 선택된 수(i)의 첫번재 배수(i+i)부터 N까지 => i의 배수 제외
            for(int j = i + i ; j <= N ; j += i){
                arr[j] = 0;
            }
        }

        for(int i = M ; i <= N; i++){   // 3. 출력
            if(arr[i] != 0)
                bw.write(arr[i] + "\n");
        }
        bw.flush();
    }
}
