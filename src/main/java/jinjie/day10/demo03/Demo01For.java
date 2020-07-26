package jinjie.day10.demo03;

import java.util.ArrayList;

public class Demo01For {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("赵敏");
        list.add("张");
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                list1.add(s);
            }
        }
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.length()==3){
                list2.add(s);
            }
        }
        System.out.println(list2);
    }
}
