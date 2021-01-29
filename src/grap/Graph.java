package grap;

import java.io.*;
import java.util.*;

public class Graph {
    private int V;   // 노드의 개수
    private LinkedList<Integer> adj[]; // 인접 리스트

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i) // 인접 리스트 초기화
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);

        for(int i = 0; i < adj.length; i++){

            System.out.println("adj["+i+"] : "+adj[i]);
        }
    }

    void DFSUtil(int v, boolean visited[]) {
        // 현재 노드를 방문한 것으로 표시하고 값을 출력
        //visted배열은 초기값이 전체 다 false
        visited[v] = true;
        System.out.println(v + " ");

        // 방문한 노드와 인접한 모든 노드를 가져온다.
        Iterator<Integer> i = adj[v].listIterator();
        System.out.println("Iterator : "+i);
        while (i.hasNext()) {
            int n = i.next();
            System.out.println("i.next : "+n);
            // 방문하지 않은 노드면 해당 노드를 시작 노드로 다시 DFSUtil 호출
            if (!visited[n]) {
                DFSUtil(n, visited); // 순환 호출
            }
        }
    }



    void DFS(int v) {
        // 노드의 방문 여부 판단 (초깃값: false)
        boolean visited[] = new boolean[V];

        // v를 시작 노드로 DFSUtil 순환 호출
        DFSUtil(v, visited);
    }

    void DFS() {
        // 노드의 방문 여부 판단 (초깃값: false)
        boolean visited[] = new boolean[V];

        // 비연결형 그래프의 경우, 모든 정점을 하나씩 방문
        for (int i=0; i<V; ++i) {
            if (visited[i] == false) {
                DFSUtil(i, visited);
            }
        }
    }


    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.DFS(2);
        //g.DFS();
    }
}
