package jinjie.day03;
/*
* 字符串的截取方法
* public String substring(int index):截取从参数位置一直到末尾
* public String substring(int begin,int end):截取中间部分
*/

import java.sql.SQLOutput;

public class Demo07Substring {
    public static void main(String[] args) {
        String str1 = "helloworld".substring(5);
        System.out.println(str1);
        String str2 = "helloworld".substring(5, 7);
        System.out.println(str2);
    }


}
