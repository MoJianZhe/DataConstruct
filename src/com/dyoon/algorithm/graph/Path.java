package com.dyoon.algorithm.graph;

import java.util.Stack;

/**
 * 寻找路径
 * Created by Administrator on 2017/10/25.
 */
public class Path {
    private boolean[] marked;
    private int[] edgeTo;//从起点到一直路径上的最后一个顶点
    private int S;//起点
    public Path(Graph G,int S){
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.S=S;
        dfs(G,S);
    }

    /**
     * 是否有s到v的路径
     * @param v
     * @return
     */
    public boolean hasPathTo(int v) {
        return marked[v];
    }

    private void dfs(Graph G, int m) {
        marked[m]=true;
        for (int W :G.adj(m) ) {
        	if(!marked[W]){
        		edgeTo[W]=m;
        		dfs(G,W);
        	}
        }
    }

    public Iterable<Integer> patchTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }
        Stack<Integer>path=new Stack<>();
        for (int x=v;x!=S;x=edgeTo[x]) {
            path.push(x);
        }
        path.push(S);
        return path;
    }



}
