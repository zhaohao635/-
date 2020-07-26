package jinjie.day08.demo02;

public class Demo02Cook {
    public static void main(String[] args) {
        //调用invokeCook方法，参数是Cook接口，传递的是匿名函数类对象
        invokeCook(new Cook() {
            @Override
            public void makefood() {
                System.out.println("吃饭了");
            }
        });
        //使用lambda表达式，简化匿名内部类的书写
        invokeCook(()->{
            System.out.println("吃饭了1");
        });
    }
    public static void invokeCook(Cook cook){
        cook.makefood();
    }
}
