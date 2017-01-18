package com.dyoon.algorithm.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/10/21.
 */
public class Nihao {
    public static  boolean checkString(String str) {
        String test = "\\d";
        Pattern pattern = Pattern.compile(test);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println("匹配的字符串"+matcher.group());
            System.out.println("第一个匹配的位置"+matcher.start());
            System.out.println(matcher.toString());
            System.out.println("最后一个匹配的位置"+matcher.end());
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(checkString("af23sdafasd"));
    }
}

