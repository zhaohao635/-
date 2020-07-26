package jinjie.day07.demo01;

import java.util.*;

public class HashMap01 {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("李晨", "范冰冰1");
        String v2 = map.put("李晨1", "范冰冰2");
        System.out.println(v1+v2);
        boolean v3 = map.containsKey("李晨");
        System.out.println(v3);
        Set<String> strings = map.keySet();
        for (String s : strings) {
            String v = map.get(s);
            System.out.println(s+":"+v);
        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            String key = next.getKey();
            String value = next.getValue();
        }

    }
}
