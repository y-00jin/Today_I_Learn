<h1><img src="https://d2gd6pc034wcta.cloudfront.net/tier/5.svg" width="30" height="30" style="vertical-align: middle;"/> [1157] 단어공부 </h1>

<a href="https://www.acmicpc.net/problem/1157 " target="_black">``문제 보기``</a>

<h3>Question</h3>

```bash
알파벳 대소문자로 된 단어가 주어지면, 
이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
단, 대문자와 소문자를 구분하지 않는다.
```
<br>

<h4>Input</h4>

```bash
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다.
주어지는 단어의 길이는 1,000,000을 넘지 않는다.
```

<h4>Output</h4>

```bash
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
```

<br><br>

<hr>

<br>

<h3>Answer</h3>


💡아스키 코드(ASCII)를 사용하여 배열 0번째 인덱스는 A, 1번째는 B ... 에 저장되게 하였습니다.


<br>

```java
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();

        int[] wordCount = new int[26];

        int max = 0;
        char resultWord = '?';

        for (char c : word.toCharArray()) {
            int idx = c - 'A';  // A를 0부터 시작하는 인덱스로 변환
            wordCount[idx]++;   // 해당 문자 개수 +1

            if (wordCount[idx] > max) { // 현재 문자의 개수가 최대값보다 큰경우
                max = wordCount[idx];
                resultWord = c;
            } else if (wordCount[idx] == max) { // 최댓값과 동일한 개수를 가진 문자가 나온 경우
                resultWord = '?';
            }
        }
        System.out.println(resultWord);
    }
}

```

<br>

<h3>Result</h3>

|메모리(KB)| 시간(ms)|
|:---:|:---:|
|26416|188|