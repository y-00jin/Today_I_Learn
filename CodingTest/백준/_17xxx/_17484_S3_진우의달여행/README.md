# [백준] 17848 - 진우의 달 여행 (Small)

[`문제 보기`](https://www.acmicpc.net/problem/17484)



# ❓ 문제 설명
우주비행사 진우는 지구에서 달까지 연료 소비를 최소화하며 이동하고 싶다.
지구에서 시작해 아래 방향으로만 한 칸씩 이동할 수 있고,
이동할 때 ↙, ↓, ↘ 방향으로만 갈 수 있다.

단, 같은 방향으로 두 번 연속 이동하는 것은 불가능하다.
이 조건을 지키며 최소 연료 소비량을 구하는 문제.


# 💡 접근 방법

- 이동은 항상 아래 방향이므로, **(0, y) → (N-1, y')**로 가는 모든 경로를 고려해야 한다.

- 방향은 총 3가지 (↙, ↓, ↘)

- 같은 방향 연속 사용 금지 조건이 있으므로, 직전 방향을 기억해야 한다.

- 따라서 DFS로 모든 경우의 수를 탐색하며, 이전 방향과 현재 방향을 비교해 연속 이동을 막고, 누적 연료량의 최솟값을 갱신해준다.


# ✅ 코드

``` java

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[] dy = {-1, 0, 1};
    static int[][] arr;
    static int N, M;
    static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 값 초기화
        arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int y = 0; y < M; y++) {
            dfs(0, y, -1, arr[0][y]);	// 0행의 모든 열(y)에서 탐색 시작
        }
        System.out.println(result);
    }

    private static void dfs(int nowX, int nowY, int dir, int sum) {
        if (nowX == N - 1) {
            result = Math.min(result, sum);   // 현재까지의 합 누적
            return;
        }

        for (int i = 0; i < 3; i++) {   // 방향별 탐색
            int newX = nowX + 1;
            int newY = nowY + dy[i];

            if (dir == i || newX < 0 || newX > N - 1 || newY < 0 || newY > M - 1)
                continue;

            dfs(newX, newY, i, sum + arr[newX][newY]);
        }
    }
}


```


## 💬 코드 설명



### 코드 예시(그림)

- 이해하기 쉽게 그림으로 재귀 함수의 흐름을 정리해봤다


![](https://velog.velcdn.com/images/d0u0b/post/1aae39f7-0e1d-451d-8207-8d5ae23a6905/image.png)


- (0, 0)인 5부터 시작하여 `좌하`, `하`, `우하` 중 **좌하**부터 탐색
- 좌하 :
    - 배열 범위내에서 갈 수 없음 -> 범위를 벗어나므로 continue
- 하 :
    - 다음 좌표 (1,0), sum = 5 + 3 = 8
    - 여기서 또 `좌하`, `하`, `우하` 탐색
    - 좌하 :
        - 배열 범위 벗어남 -> continue
    - 하 :
        - 이전과 동일한 방향 -> continue
    - 우하 :
        - (2, 1), sum = 5 + 3 + 77 = 85


- 이렇게 깊이 끝까지 탐색하면서, 도착한 순간 누적 합을 result와 비교
- 위 과정을 시작점 (0,0) ~ (0,M-1)까지 반복하여 최소값을 구함

---


### 1. 전역 변수 선언

```java
static int[] dy = {-1, 0, 1}; // 이동할 수 있는 방향 (좌하, 하, 우하) → y 좌표 기준
static int[][] arr;           // 행성의 연료 맵
static int N, M;              // 행과 열의 크기
static int result = Integer.MAX_VALUE; // 최소 연료량 저장용
```


### 2. 입력 처리

``` java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine());
N = Integer.parseInt(st.nextToken());
M = Integer.parseInt(st.nextToken());

arr = new int[N][M]; // 지도의 크기만큼 배열 생성

for (int i = 0; i < N; i++) {
    st = new StringTokenizer(br.readLine());
    for (int j = 0; j < M; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
    }
}
```

### 3. DFS 호출 (탐색 시작)

``` java
for (int y = 0; y < M; y++) {
    dfs(0, y, -1, arr[0][y]); // 0행의 모든 열(y)에서 탐색 시작
}
System.out.println(result);

```

- 첫 번째 행(x = 0)의 **모든 열(M개)**에서 출발 가능한 경로를 탐색해야 하므로,
- (0, y)를 시작점으로 하여 DFS를 반복 호출
- dir은 직전 방향을 의미하고 -1은 초기 상태(방향 없음)



### 4. DFS 함수

``` java
private static void dfs(int nowX, int nowY, int dir, int sum)
```
- nowX, nowY: 현재 위치
- dir: 직전 방향 (0: 왼쪽 아래, 1: 아래, 2: 오른쪽 아래)
- sum: 지금까지의 연료 합계


### 5. 종료 조건

```java
if (nowX == N - 1) {
    result = Math.min(result, sum); // 맨 아래 행에 도달하면 최소값 갱신
    return;
}
```

- 마지막 행에 도달하면 더 이상 내려갈 수 없으므로 result 갱신 후 종료
- 단, result는 최소값으로 갱신


### 6. 재귀 탐색

```java
for (int i = 0; i < 3; i++) {
    int newX = nowX + 1;
    int newY = nowY + dy[i];

    if (dir == i || newX < 0 || newX >= N || newY < 0 || newY >= M)
        continue;

    dfs(newX, newY, i, sum + arr[newX][newY]);
}
```

- 3방향 (좌하, 하, 우하) 중 하나를 선택해서 다음 칸으로 이동
- 조건:
    - 같은 방향을 연속으로 사용할 수 없음 → dir == i면 continue
    - 배열의 범위를 벗어나지 않게 경계 조건 체크
- 다음 위치로 이동하면서 방향(i) 과 누적합(sum) 을 업데이트


