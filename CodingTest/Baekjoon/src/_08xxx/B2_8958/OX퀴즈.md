<h1><img src="https://d2gd6pc034wcta.cloudfront.net/tier/4.svg" width="30" height="30" style="vertical-align: middle;"/> [8958] OX퀴즈</h1>

<a href="https://www.acmicpc.net/problem/8958 " target="_black">``문제 보기``</a>


<h3>Question</h3>
```bash
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
```
<br>


<br><br>

<hr>

<br>

<h3>Answer</h3>


💡 O가 연속된 경우에는 1 2 3 ... 연속된 수 만큼 결과에 더하고 X인 경우에는 더하지 않음

<br>

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopCount = Integer.parseInt(br.readLine());    // 반복 횟수

        for (int i = 0; i < loopCount; i++) {
            String oxResults = br.readLine();
            int score = 0;
            int preScore = 0;

            for (int j = 0; j < oxResults.length(); j++) {
                if ('O' == oxResults.charAt(j)) {
                    preScore = (preScore > 0) ? ++preScore : 1;
                } else{
                    preScore = 0;
                }
                score += preScore;
            }
            System.out.println(score);
        }
    }
}

```

<br>

<h3>Result</h3>

|메모리(KB)| 시간(ms) |
|:---:|:------:|
|11624|   88   |
