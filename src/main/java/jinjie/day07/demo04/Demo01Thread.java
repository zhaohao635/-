package jinjie.day07.demo04;

public class Demo01Thread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run"+i);
        }
        System.out.println("当前线程"+Thread.currentThread().getName());
    }
}
