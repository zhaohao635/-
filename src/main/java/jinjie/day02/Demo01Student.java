package jinjie.day02;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("赵");
        System.out.println(stu.getName());
        Student stu1 = new Student("浩");
        System.out.println(stu1.getName());
        stu1.setName("王");
        System.out.println(stu1.getName());
    }
}
