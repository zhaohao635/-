package jinjie.day04.demo03;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Zi extends Fu{



    @Override
    public void method() {
        System.out.println("子类方法");
    }



    public void methodZi(){
        System.out.println("子类特有方法");
    }

    @Override
    public void methoda() {
        System.out.println("抽象方法");
    }
}
