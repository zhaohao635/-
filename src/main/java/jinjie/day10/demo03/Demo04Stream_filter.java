package jinjie.day10.demo03;

import javax.naming.Name;
import java.util.stream.Stream;

public class Demo04Stream_filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张无忌", "周芷若", "赵敏", "张翠山");
        stream.filter(name->name.startsWith("张")).forEach(name-> System.out.println(name));
    }
}
