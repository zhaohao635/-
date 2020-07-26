package jinjie.day10.demo02;

import java.util.Arrays;
import java.util.Comparator;

public class Demo03Comparator {
    public static Comparator<String> getComparator(){
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        };
//        return (String o1,String o2)->{
//            return o2.length()-o1.length();
//        };
        return (o1, o2) -> o2.length()-o1.length();
    }

    public static void main(String[] args) {
        String[] arr = {"aaaa","bbbbb","cc"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));
        int i = 100;
        String s = i + "";
    }
}
