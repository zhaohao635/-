package jinjie.day04.demo01;

public class DemoMain {
    public static void main(String[] args) {
        Zi mao = new Zi();
        mao.eat();
        Fu fu = new Fu() {
            @Override
            public void eat() {
                System.out.println("匿名函数");
            }
        };
        fu.eat();
    }
}
