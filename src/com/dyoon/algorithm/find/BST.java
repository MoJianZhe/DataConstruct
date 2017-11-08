package com.dyoon.algorithm.find;

/**
 * 二叉查找树（binary search tree)
 * Created by Administrator on 2017/5/17.
 */
public class BST<Key extends Comparable<Key>,Value> {
    private Node root;
    private class Node{
        Key key;
        Value value;
        Node left;Node right;
        private int N;//以该节点为根节点的子树中的节点总数

        public Node(Key key, Value value, int N) {
            this.key=key;
            this.value=value;
            this.N=N;
        }
    }

    public int size() {
        return size(root);
    }
    private int size(Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.N;
        }
    }

    public Value get(Key key) {
        return  get(root, key);
    }

    private Value get(Node r, Key key) {
        if(r ==null) return null;
        if(key.compareTo(r.key)<0) {
            return get(r.left, key);
        } else if (key.compareTo(r.key) > 0) {
            return get(r.right, key);
            }
        else {
            return r.value;
        }
    }

  /* 错误的put方法
  public void put(Key key, Value value) {
        put(root,key,value);
    }

    private void put(Node r, Key key, Value value) {
        if (r == null) {
            r = new Node(key, value, 1);//这个并没有将root的地址指向新的Node,
                                        //只是将r的地址指向了Node.
        } else if (key.compareTo(r.key) > 0) {
            put(r.right,key,value);
        } else if (key.compareTo(r.key) < 0) {
            put(r.left, key, value);
        } else {
            r.value=value;
            r.N=size(r.left)+size(r.right)+1;
        }

    }
*/

  //正确的put方法

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node r, Key key, Value value) {
        if(r==null){
            return new Node(key, value, 1);
        }
        if (key.compareTo(r.key) > 0) {
            r.right= put(r.right, key, value);
        } else if (key.compareTo(r.key) < 0) {
            r.left= put(r.left, key, value);
        } else {
            r.value=value;
        }
        r.N=size(r.left)+size(r.right)+1;
        return r;
    }
}







