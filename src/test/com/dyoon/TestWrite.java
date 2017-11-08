package com.dyoon;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Administrator on 2017/6/1.
 */
public class TestWrite extends TestCase{

    public void testWrite() {
        File file = new File("D://writer.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("32");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
