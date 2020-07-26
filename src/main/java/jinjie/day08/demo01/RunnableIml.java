package jinjie.day08.demo01;

public class RunnableIml implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行");
    }
}
