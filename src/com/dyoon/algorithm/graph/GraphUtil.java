package com.dyoon.algorithm.graph;

/**
 * Created by Administrator on 2017/10/23.
 */
public class GraphUtil {
    /**
     * 计算v的度数
     * @param G
     * @param v
     * @return
     */
    public static int degree(Graph G, int v) {
        int degree=0;
        for (Integer integer : G.adj(v)) {
            degree++;
        }
        return degree;
    }

    /**
     * 计算所有定点的最大度数
     * @param graph
     * @return
     */
    public static int maxDegree(Graph graph) {
        int max=0;
        for (int i = 0; i < graph.V(); i++) {
            if (degree(graph, i) > max) {
                max = degree(graph, i);
            }
        }
        return max;
    }

    /**
     * 计算所有定点的平均度数
     */

    public static double avgDegree(Graph G) {
        return 2.0* G.E()/G.V();
    }


    /**
     * 自环个数
     * @param G
     * @return
     */
    public static int numberOfSelfLoops(Graph G) {
        int count = 0;
        for (int v = 0; v < G.V(); v++) {
            for (Integer integer : G.adj(v)) {
                if (integer == v) {
                    count++;
                }
            }
        }
        return count;
    }
}
