package jinjie.day02;

public class Chart1 {
    public static void main(String[] args) {
        Demo01Person person1 = new Demo01Person();
        person1.show();
        person1.name = "zhao";
        person1.setAge(-1);
        person1.show();
        person1.setAge(5);
        person1.show();
    }
}
