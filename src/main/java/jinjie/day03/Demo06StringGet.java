package jinjie.day03;
/*
* String中与获取相关的常用方法：
* public int length():获取字符串当中含有的字符个数，拿到字符串长度
* public String concat(String str):将当前字符串和参数字符串拼接，返回新的字符串
* public char charAt(int index):获取指定索引位置的单个字符，索引从0开始
* public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，如果没有-1
* */

import javax.print.DocFlavor;

public class Demo06StringGet {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        System.out.println(str1.length());
        String str3 = str1.concat(str2);
        System.out.println(str3);
        char ch = "helloworld".charAt(1);
        System.out.println(ch);
        int num = "helloworldhelloword".indexOf("llo");
        System.out.println(num);
    }
}
