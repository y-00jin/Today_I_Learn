<h1><img src="https://d2gd6pc034wcta.cloudfront.net/tier/5.svg" width="30" height="30" style="vertical-align: middle;"/> [1259] 팰린드롬수 </h1>

<a href="https://www.acmicpc.net/problem/1259" target="_black">``문제 보기``</a>  


<h3>Question</h3>

```bash
어떤 단어를 뒤에서부터 읽어도 똑같다면 그 단어를 팰린드롬이라고 한다. 'radar', 'sees'는 팰린드롬이다.
수도 팰린드롬으로 취급할 수 있다.
수의 숫자들을 뒤에서부터 읽어도 같다면 그 수는 팰린드롬수다.
121, 12421 등은 팰린드롬수다.
123, 1231은 뒤에서부터 읽으면 다르므로 팰린드롬수가 아니다.
또한 10도 팰린드롬수가 아닌데, 앞에 무의미한 0이 올 수 있다면 010이 되어 팰린드롬수로 취급할 수도 있지만,
특별히 이번 문제에서는 무의미한 0이 앞에 올 수 없다고 하자.
```
<br>

<h4>Input</h4>

```bash
입력은 여러 개의 테스트 케이스로 이루어져 있으며, 각 줄마다 1 이상 99999 이하의 정수가 주어진다.
입력의 마지막 줄에는 0이 주어지며, 이 줄은 문제에 포함되지 않는다.
```

<h4>Output</h4>

```bash
각 줄마다 주어진 수가 팰린드롬수면 'yes', 아니면 'no'를 출력한다.
```

<br><br>

<hr>

<br>

<h3>Answer</h3>

> [!TIP]  
> **💡 팰린드롬수가 될 수 있는 경우 생각해보기**  
> 1. 한자리 수는 모두 팰린드롬 수  
> 2. 글자수가 5자(홀수)인 경우 0번째=4번째 / 1번째=3번째 
> 3. 글자수가 4자(짝수)인 경우 0번째=3번째 / 1번째=2번째  
> 결국 글자수의 반을 기준으로 앞에서 1개 뒤에서 1개 비교하여 모두 같으면 팰린드롬수인 것을 볼 수 있습니다.
 

<br>

```java
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){

            String num = br.readLine();
            if("0".equals(num)) break;

            boolean check = true;
            for (int i = 0, len = num.length(); i < len / 2; i++) {
                if (num.charAt(i) != num.charAt(len - 1 - i)) {
                    check = false;
                    break;
                }
            }
            sb.append(check ? "yes\n" : "no\n");
        }
        System.out.println(sb);
    }
}

```

<br>

<h3>Result</h3>

|메모리(KB)| 시간(ms)|
|:---:|:---:|
|11444|64|