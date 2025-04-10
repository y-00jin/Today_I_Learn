# 깊이 우선 탐색 (DFS)  

- 그래프의 시작 노드에서 출발하여 탐색할 한 쪽 분기를 정하여 최대 깊이까지 탐색 후 다른 쪽 분기로 이동하여 다시 탐색을 수행하는 알고리즘

|              기능              |                특징                 | 시간 복잡도 (노드수 : V / 에지 수 : E) |
| :--------------------------: | :-------------------------------: | :-------------------------: |
| 그래프 완전 탐색<br>(그래프의 모든 노드 탐색) | - 재귀 함수로 구현<br>- 스택 자료구조(FILO) 이용 |          O(V + E)           |
> 💡FILO (후입선출)
> - 먼저 들어온 데이터가 나중에 나감 = 나중에 들어온 데이터가 먼저 나감

- DFS 구현은 스택 성질을 갖는 재귀 함수로 많이 구현함
	- 재귀 함수를 이용하므로 Stack Overflow 유의
- 단절점 찾기, 단절선 찾기, 사이클 찾기, 위상 정렬 등의 문제를 DFS로 풀 수 있음


## 동작 원리 (스택 사용)

- 한번 방문한 노드를 다시 방문하지 않음 -> 노드 방문 여부를 체크할 배열이 필요  

1. DFS를 시작할 노드를 정한 후 사용할 자료구조(인접리스트) 초기화
	- 인접 리스트 초기화
	- 방문 배열 초기화
2. 스택에 들어있는 시작 노드를 꺼낸 후 노드의 인접 노드를 다시 스택에 삽입
	- 스택에 삽입하는 인접 노드가 이미 방문한 노드라면 삽입X
3. 스택 자료구조에 값이 없을 때까지 반복