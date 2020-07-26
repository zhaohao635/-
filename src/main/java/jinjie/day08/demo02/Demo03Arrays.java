package jinjie.day08.demo02;

import java.util.Arrays;
import java.util.Comparator;

public class Demo03Arrays {
    public static void main(String[] args) {
        Person[] people = {
                new Person("迪丽热巴",18),
                new Person("古力娜扎",17),
                new Person("柳岩",21)
        };
//        Arrays.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        Arrays.sort(people,(Person o1, Person o2) -> {
            return o1.getAge()-o2.getAge();
        });

        for (Person p : people) {
            System.out.println(p);
        }
    }
}
