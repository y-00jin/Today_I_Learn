package _11xxx._11724_S2_연결요소의개수;

import java.io.*;
import java.util.*;

public class Main {
    static boolean visited[];
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());   // 정점
        int m = Integer.parseInt(st.nextToken());   // 간선

        visited = new boolean[n+1];   // 방문 배열
        A = new ArrayList[n+1];

        for(int i=1;i<=n;i++)
            A[i] = new ArrayList<>();

        for(int i=0;i<m;i++){           // 인접 리스트 초기화
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);
        }

        int count = 0;
        for(int i=1;i<=n;i++){
            if(!visited[i]) {   // 방문 노드 X
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) {
        if(visited[v])
            return;

        visited[v] = true;
        for(int i : A[v]){
            if(!visited[i])
                DFS(i);
        }
    }
}
