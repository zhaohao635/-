package jinjie.day03;

import java.util.Arrays;

public class Demo10Arrays {
    public static void main(String[] args) {
        int[] intArrays = {10,20,30};
        System.out.println(intArrays);
        String inStr = Arrays.toString(intArrays);
        System.out.println(inStr);
        int[] array1 = {2,1,5,6,3};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        char[] charArray = {'a','b'};
        String str2 = new String(charArray);
        System.out.println(str2);
        Math.abs(2.5);
        System.out.println(Math.PI);

    }
}
