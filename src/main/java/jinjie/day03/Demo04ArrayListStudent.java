package jinjie.day03;

import java.util.ArrayList;

public class Demo04ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("洪七公",20);
        Student two = new Student("欧阳锋", 21);
        list.add(one);
        list.add(two);
        System.out.println(list);
        for (int i = 0; i < 2; i++) {
            Student student = list.get(i);
            System.out.println("姓名"+student.getName()+"年龄"+student.getAge());
        }
    }

}
