package com.dyoon.algorithm.graph;

/**
 * 深度优先搜索算法。
 * Created by Administrator on 2017/10/24.
 */
public class DepthFirstSearch {

    private boolean[] marked;
    private int count;
    public DepthFirstSearch(Graph G, int s) {
        marked = new boolean[G.V()];
        dsf(G, s);
    }



    private void dsf(Graph G, int v) {
        marked[v]=true;
        count++;
        for (Integer integer : G.adj(v)) {
            if (!marked[integer]) {
                dsf(G,integer);
            }
        }
    }

    public  int count() {
        return  count;
    }


}
