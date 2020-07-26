package jinjie.day10.demo01;

import jinjie.day04.demo03.MyInterfaceAbstractImpl;

public class Demo01 {
    public static void show(MyFunctionInterface myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionInterfaceImpl());
        show(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的方法");
            }
        });
        show(()->{
            System.out.println("使用lambda表达式");
        });
        show(()-> System.out.println("省略形式的lambda表达式"));
    }
}
