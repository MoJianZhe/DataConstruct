package com.dyoon.algorithm.graph;

/**
 * edge（边） vertex(定点)
 * Created by Administrator on 2017/10/23.
 */

public class Graph {
    private  int V;//定点数
    private  int E;//边数
    private  Bag<Integer> [] adj;//邻接表



    public int V(){//顶点数
        return V;
    }

    public int E(){//边数
        return E;
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }



    /**
     * 与v相邻的所有定点。
     * @param v
     * @return
     */
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }


}
