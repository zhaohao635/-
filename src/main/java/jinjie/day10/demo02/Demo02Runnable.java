package jinjie.day10.demo02;

public class Demo02Runnable {
    //定义一个方法startThreac，方法的参数使用函数式接口Runnable
    public static void startThread(Runnable run) {
        new Thread(run).start();
    }

    public static void main(String[] args) {
        //调用startThread方法，方法的参数是一个接口，那么我们可以传递这个接口的匿名函数类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程");
            }
        });
        startThread(() -> {
            System.out.println(Thread.currentThread().getName() + "线程");
        });
    }
}
