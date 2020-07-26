package jinjie.day04.demo03;

public class MyInterfaceAbstractImpl implements MyInterfaceAbstract{
    @Override
    public void methodAbs1() {
        System.out.println("抽象类第一个");
    }

    @Override
    public void methodAbs2() {
        System.out.println("抽象类第二个");

    }

    @Override
    public int methodAbs3(int num) {
        System.out.println("抽象类第三个");
        return 0;
    }

    @Override
    public String methodAbs4() {
        System.out.println("抽象类第四个");
        return null;
    }

    @Override
    public int methodAbs5(int num) {
        System.out.println("抽象类第五个");
        return 0;
    }
}
