package jinjie.day10.demo03;

import java.util.stream.Stream;

public class Demo07Stream_limit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
//        Stream<String> stream1 = stream.limit(3);
        Stream<String> stream1 = stream.skip(3);
//        Stream<String> concat = Stream.concat(stream1, stream2);
        stream1.forEach(i-> System.out.println(i));

    }
}
