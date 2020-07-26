package jinjie.day03;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        //创建  System.in代表从键盘进行输入
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("输入的数字是："+ num);
        String str = sc.next();     //获取键盘上输入的字符串
        System.out.println("输入的字符串是："+str);
    }
}
