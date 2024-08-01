package _30xxx._30804_S2;
import java.io.*;
import java.util.StringTokenizer;

public class Main2 {
    static int[] fruits;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int result = 0;
        // 인덱스 담는 배열, 몇번째에 무슨 과일인지
        int[] arr = new int[N];
        // 총 과일 개수 담는 배열 (과일 번호에 해당하는 인덱스++, 최대 9개이므로 세기 쉽게 9+1)
        fruits = new int[10];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            fruits[num]++;
        }

        // 2개 이하면 그냥 N 출력함
        if (countFruitKind() <= 2) {
            result = N;
        } else {
            // 시작 또는 마지막에서 과일을 빼야함
            int start = 0;
            int end = N - 1;
            while (start < end) {
                // 이케이케 조건을 다 실행하고 과일 개수가 2개 이하라면 리턴
                if (countFruitKind() <= 2) {
                    result = end - start + 1;
                    break;
                }

                // 앞 뒤중 과일의 개수가 더 적은거 제거
                if (fruits[arr[start]] > fruits[arr[end]]) {
                    fruits[arr[end]]--;
                    end--;
                }else{
                    fruits[arr[start]]--;
                    start++;
                }
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

    // 과일 총 종류 몇갠지
    static int countFruitKind() {
        int fCount = 0;
        for (int i = 0; i < 10; i++) {
            if (fruits[i] > 0) fCount++;
        }
        return fCount;
    }
}