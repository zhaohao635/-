package jinjie.day06.demo02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add(1,"w");
        System.out.println(list);
        String remove = list.remove(2);     //返回值为被移除的字符串
        System.out.println(remove);
        System.out.println(list);
        String a = list.set(2, "A");        //返回值为被替换掉的字符串
        System.out.println(list.get(1));
        System.out.println(a);
        System.out.println(list);
    }
}
