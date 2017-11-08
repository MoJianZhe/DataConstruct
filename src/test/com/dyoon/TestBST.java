package com.dyoon;

import com.dyoon.algorithm.find.BST;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/17.
 */
public class TestBST extends TestCase {
    @Test
    public void testBSTPut() {
        BST<Integer,String >bst=new BST<>();
        bst.put(12, "12");
        bst.put(23,"23");
        System.out.println(bst.get(23));
        File file = new File("D://txt.txt");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("hello world");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
