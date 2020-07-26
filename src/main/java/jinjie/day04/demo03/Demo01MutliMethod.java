package jinjie.day04.demo03;

public class Demo01MutliMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();
        obj.methodFu();
        System.out.println(obj instanceof Zi);
//        System.out.println(obj instanceof jinjie.day04.demo01.Zi);
    }
}
