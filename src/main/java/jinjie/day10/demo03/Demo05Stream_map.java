package jinjie.day10.demo03;

import java.util.stream.Stream;

public class Demo05Stream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        Stream<Integer> stream2 = stream.map((String s) -> {
            return Integer.parseInt(s)+1;
        });
        stream2.forEach(i-> System.out.println(i));
        long count = stream.count();

    }
}
