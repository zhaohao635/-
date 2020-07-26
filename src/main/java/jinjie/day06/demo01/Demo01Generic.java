package jinjie.day06.demo01;

public class Demo01Generic {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.method01(1);
        gm.method01("fa");
        GenericMethod.method02("直接使用类调用静态方法");

    }
}
