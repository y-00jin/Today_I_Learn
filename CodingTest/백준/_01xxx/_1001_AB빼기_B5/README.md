# <img src="https://d2gd6pc034wcta.cloudfront.net/tier/1.svg" width="30" height="30" style="vertical-align: middle;"/> [1001] A-B

<a href="https://www.acmicpc.net/problem/1001 " target="_black">``문제 보기``</a>

<h3>Question</h3>

```bash
두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
```

<br>

<h3>Answer</h3>

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] agrs) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String inputValues = bf.readLine();
		StringTokenizer st = new StringTokenizer(inputValues);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println(a-b);
	}
}
```

<br>

<h3>Result</h3>

|메모리(KB)| 시간(ms)|
|:---:|:---:|
|11516|76|