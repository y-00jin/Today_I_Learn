<h1><img src="https://d2gd6pc034wcta.cloudfront.net/tier/4.svg" width="30" height="30" style="vertical-align: middle;"/> [1152] 단어의 개수</h1>

<a href="https://www.acmicpc.net/problem/1152 " target="_black">``문제 보기``</a>


<h3>Question</h3>

```bash
영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
```
<br>

<h4>Input</h4>

```bash
첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다.
단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
```

<h4>Output</h4>

```bash
첫째 줄에 단어의 개수를 출력한다.
```

<br><br>

<hr>

<br>

<h3>Answer</h3>


💡입력한 문장을 StringTokenizer를 이용해 문장을 나누고 countTokens()로 개수를 구한다

<br>

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(st.countTokens());
    }
}
```

<br>

<h3>Result</h3>

|메모리(KB)| 시간(ms)|
|:---:|:---:|
|19736|156|