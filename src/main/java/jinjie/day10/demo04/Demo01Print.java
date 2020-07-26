package jinjie.day10.demo04;

import java.lang.annotation.Target;



public class Demo01Print {
    public static void printString(Demo01Printable p){
        p.pr("hello");
    }
    public static void main(String[] args) {
        printString((s)->{
            System.out.println(s+"==");
        });
        printString(System.out::println);
    }
}
