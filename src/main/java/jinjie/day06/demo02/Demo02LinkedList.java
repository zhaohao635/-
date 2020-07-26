package jinjie.day06.demo02;

import java.util.LinkedList;

public class Demo02LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("af");
        linked.addFirst("w");
        linked.addLast("fa");
        System.out.println(linked);
        String s = linked.pop();
        System.out.println(s);
        System.out.println(linked);

    }
}
