package jinjie.day06.demo02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo03Set extends Object{
    public static void main(String[] args) {
        Set<Integer> se = new HashSet<>();
        se.add(1);
        se.add(2);
        int w =add(0,10,15,12,5);
        Iterator<Integer> it = se.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            System.out.println(n);
        }
        for (Integer i : se) {
            System.out.println(i);
        }
    }
    public static int add(int...arr){
        System.out.println(arr);
        System.out.println(arr.length);
        return 0;
    }
}
