package jinjie.day07.demo04;

public class ThreadIml implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
