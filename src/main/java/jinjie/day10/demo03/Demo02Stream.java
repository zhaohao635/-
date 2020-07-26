package jinjie.day10.demo03;

import java.util.ArrayList;

public class Demo02Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("赵敏");
        list.add("张");
        list.stream().filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));
    }
}
