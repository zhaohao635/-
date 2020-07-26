package jinjie.day03;

public class Phone {
    public Phone(){
        System.out.println("父类构造方法调用");
    }
    public void call(){
        System.out.println("打电话");

    }
    public void show(){
        System.out.println("显示电话号码");
    }
}
