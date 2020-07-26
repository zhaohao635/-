package jinjie.day10.demo03;

import java.util.stream.Stream;

public class Demo06Stream_count {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        long count = stream.count();
        System.out.println(count);
    }
}
