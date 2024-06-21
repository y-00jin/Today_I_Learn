package _03xxx.S4_3048;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

	static char[] group1;
	static char[] group2;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// 두 그룹의 개미 수
		String inputValues = br.readLine();
		StringTokenizer st = new StringTokenizer(inputValues);
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());

        group1 = br.readLine().toCharArray();	// 첫 번째 그룹의 개미 배열
        group2 = br.readLine().toCharArray();	// 두 번째 그룹의 개미 배열

		char[] ants = new char[n1 + n2];	// 하나의 배열에 넣기
		int index = 0;
        for (int i = n1 - 1; i >= 0; i--) {	// 첫 번째 그룹 역순으로 저장
            ants[index++] = group1[i];
        }
        for (int i = 0; i < n2; i++) {		// 두 번째 그룹 순서대로 저장
            ants[index++] = group2[i];
        }
		int time = Integer.parseInt(br.readLine());	// 시간
		for (int i = 0; i < time; i++) {	// 시간만큼 반복
			int changeNum;	// 교환 수
			if (n1 == 1) {
				changeNum = n1;
			} else if ((i + 1) <= n1) {
				changeNum = i + 1;
			} else {
				changeNum = Math.abs(2 * n1 - (i + 1));
			}

			int changeNumCheck = 0;	// 실제 교환 수
			for (int j = 0; j < ants.length - 1; j++) {
				if (changeNumCheck >= changeNum) {
                    break;
                }
				if (check(ants[j], ants[j + 1])) {
					char temp = ants[j];
                    ants[j] = ants[j + 1];
                    ants[j + 1] = temp;
                    changeNumCheck++;
                    j++; // 다음 개미는 이미 바뀐 상태이므로 건너뛰기
				}
			}
	        if (changeNumCheck <= 0) {	// 교환이 하나도 발생하지 않았으면 종료
	            break;
	        }
		}
		System.out.println(new String(ants));
	}
	// 교환할 개미인지 확인
	public static boolean check(char antA, char antB) {
		boolean isInGroup1 = false;
        boolean isInGroup2 = false;

        for (char c : group1) {
            if (c == antA) {
                isInGroup1 = true;
                break;
            }
        }
        for (char c : group2) {
            if (c == antB) {
                isInGroup2 = true;
                break;
            }
        }
		return isInGroup1 && isInGroup2; // antA가 group1이고 그 다음 값이 group2인 antB이면 교환
	}
}