<h1><img src="https://d2gd6pc034wcta.cloudfront.net/tier/6.svg" width="30" height="30" style="vertical-align: middle;"/> [1181] 단어 정렬 </h1>

<a href="https://www.acmicpc.net/problem/1181" target="_black">``문제 보기``</a>

<h3> Question</h3>

```bash
알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

길이가 짧은 것부터
길이가 같으면 사전 순으로
단, 중복된 단어는 하나만 남기고 제거해야 한다.
```
<br>

<h4> Input</h4>

```bash
첫째 줄에 단어의 개수 N이 주어진다.(1 ≤ N ≤ 20,000)
둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다.
주어지는 문자열의 길이는 50을 넘지 않는다.
```

<h4> Output</h4>

```bash
조건에 따라 정렬하여 단어들을 출력한다.
```

<br><br>

---

<br>

<h3> Answer</h3>

💡 저는 이 문제를 아래 두 메서드를 이용하여 해결하였습니다

> **Comparator.comparingInt()**  
> - 숫자값을 기준으로 정렬할 때 사용  
> 
> ```java
> Arrays.sort(str, Comparator.comparingInt(String::length));
> ```   
> 위 코드는 str배열을 Arrays.sort를 이용해 정렬하는데  
> Comparator.comparingInt(String::length) 즉, 문자열 길이가 기준이 됩니다.
  
<br>

> **thenComparing()**  
> - 첫 번째 정렬 기준이 같을 경우, 추가적인 정렬 기준을 적용할 때 사용  
>   
> ```java
> Arrays.sort(str, Comparator.comparingInt(String::length).thenComparing(String::compareTo));
> ```  
> 문자열 길이를 기준으로 첫번째 정렬하고  
> 길이가 같으면 알파벳 순으로 정렬  
  
<br>

1. 먼저 N개의 String[]에 단어를 저장하고

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int N = Integer.parseInt(br.readLine());
String[] str = new String[N];

for(int i=0;i < N;i++){
    str[i] = br.readLine(); // 입력한 단어 저장
}
```

<br>  

2. 문자의 길이, 사전 순으로 정렬합니다  

```java
Arrays.sort(str, Comparator.comparingInt(String::length).thenComparing(String::compareTo)); // 길이순 정렬 -> 길이가 같으면 사전순 정렬
```

<br>

3. 정렬된 배열에서 n번째와 n-1번째 문자를 비교해 같지 않은 경우에만 StringBuilder에 추가해 출력하였습니다 (중복 제거)

```java
StringBuilder sb = new StringBuilder();
sb.append(str[0]).append("\n");

for (int i = 1; i < N; i++) {
    if (!str[i].equals(str[i - 1])) {
        sb.append(str[i]).append("\n");
    }
}
System.out.println(sb);
```  

<br><br>

<h4> 전체 코드</h4>

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];

        for(int i=0;i < N;i++){
            str[i] = br.readLine(); // 입력한 단어 저장
        }

        Arrays.sort(str, Comparator.comparingInt(String::length).thenComparing(String::compareTo)); // 길이순 정렬 -> 길이가 같으면 사전순 정렬
        StringBuilder sb = new StringBuilder();
        sb.append(str[0]).append("\n");

        for (int i = 1; i < N; i++) {
            if (!str[i].equals(str[i - 1])) {
                sb.append(str[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
```

<br>

<h3> Result</h3>

|메모리(KB)| 시간(ms) |
|:---:|:------:|
|31788|  348   |