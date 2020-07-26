package jinjie.day07.demo02;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exercise {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println(str);
        String next = str.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : next.toCharArray()) {
            if (map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else {
                map.put(c,1);
            }
        }
        Set<Character> sets = map.keySet();
        for (Character set : sets) {
            Integer value = map.get(set);
            System.out.println(set+":"+value);
        }

    }
}
