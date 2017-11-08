package com.dyoon.algorithm.find;

/**
 * Created by Administrator on 2017/3/30.
 */
public interface ST<Key,Value> {
    Value get(Key key);

    void put(Key key, Value value);

    void getMax();

}
