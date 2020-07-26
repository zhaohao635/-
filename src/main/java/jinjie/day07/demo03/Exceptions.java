package jinjie.day07.demo03;

import java.util.Objects;

public class Exceptions {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        try{
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("正常执行");
//        Objects.requireNonNull(1,"传递的对象为null");
    }
}
