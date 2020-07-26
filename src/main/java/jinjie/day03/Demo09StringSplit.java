package jinjie.day03;
/*
* 分隔字符串的方法
* public String[ ] split(String regex):按照参数的规则，将字符串切分成为若干部分
* split方法的参数其实是一个正则表达式，如果要按照英文句号进行切分就要使用"\\."
* */

public class Demo09StringSplit {
    public static void main(String[] args) {
        String[] arr = "aaa.bbb.ccc".split("\\.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
