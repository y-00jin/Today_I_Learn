package _12xxx._12891_S2_DNA비밀번호;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[] checkArr;    // 현재 상태 배열
    static int[] myArr;       // 현재 상태 배열
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());   // DNA 문자열 길이
        int P = Integer.parseInt(st.nextToken());   // 부분문자열의 길이

        checkArr = new int[4];    // 비밀번호 체크 배열
        myArr = new int[4];
        char[] A = new char[S];         // 입력 문자

        int result = 0;
        checkSecret = 0;


        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0)
                checkSecret++;
        }

        for (int i = 0; i < P; i++) {   // 부분 문자열 세팅
            Add(A[i]);
        }

        if(checkSecret == 4) result++;

        // 슬라이딩 윈도우
        for(int i=P;i<S;i++){
            int j= i-P;
            Add(A[i]);      // 새롭게 추가되는 문자
            Remove(A[j]);   // 가장 왼쪽 값 삭제

            if(checkSecret == 4) result++;
        }
        System.out.println(result);
    }

    private static void Remove(char c) {
        switch (c){
            case 'A':
                if(myArr[0] == checkArr[0]) checkSecret--;  // A조건 만족시 -1
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]) checkSecret--;  // C조건 만족시 -1
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]) checkSecret--;  // G조건 만족시 -1
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]) checkSecret--;  // T조건 만족시 -1
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkSecret++;  // A조건 만족시 +1
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkSecret++;  // C조건 만족시 +1
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkSecret++;  // G조건 만족시 +1
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkSecret++;  // T조건 만족시 +1
                break;
        }
    }
}
