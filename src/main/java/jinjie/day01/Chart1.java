package jinjie.day01;

import java.util.Arrays;

public class Chart1 {
    public static void main(String[] args) {
        int[] arraya = {10,20,30,40};
        System.out.println("面向过程");
        System.out.print("[");
        for (int i = 0; i < arraya.length; i++) {
            if(i==arraya.length-1){
                System.out.println(arraya[i]+"]");
            }else{
                System.out.print(arraya[i]+",");
            }
        }
        System.out.println("======面向对象======");
        System.out.println(Arrays.toString(arraya));
    }
}
