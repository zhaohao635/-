package jinjie.day08.demo02;

public class Demo01Lambda {
    public static void main(String[] args) {
        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        //使用lambda表达式，实现多线程
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"c");
        }).start();

    }
}
