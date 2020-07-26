package jinjie.day04.demo03;

public class MyInterMain {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        System.out.println(impl.methodAbs3(3));
        impl.methodAbs4();
        System.out.println(impl.methodAbs5(5));


    }

}
