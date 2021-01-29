package grap;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphTest {

    LinkedList<Integer> a[];

    GraphTest(int v){
        a = new LinkedList[v];

        for(int i =0; i < v; ++i){
            a[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w){
        a[v].add(w);

        for(int i = 0; i < a.length; i++){
            System.out.println("a["+i+"] : "+a[i]);
        }
    }

    void checkValue(int v){
        System.out.println("index : "+v);

        Iterator<Integer> i = a[v].listIterator();

        System.out.println(i);
        while(i.hasNext()){
            int n = i.next();
            System.out.println("i : "+n);

        }
    }

    public static void main(String[] args) {
        GraphTest g = new GraphTest(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.checkValue(2);
    }


}
