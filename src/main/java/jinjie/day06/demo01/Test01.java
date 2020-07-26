package jinjie.day06.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test01 {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("af");
        col.add("ew");
        col.add("ew");
        System.out.println(col);
        Object[] obj = col.toArray();
        for (int i = 0; i < col.size(); i++) {
            System.out.println(obj[i]);
        }
        Iterator<String> it = col.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("========");
        for (String s : col) {
            System.out.println(s);
        }
    }
}
