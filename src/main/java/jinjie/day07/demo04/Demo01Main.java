package jinjie.day07.demo04;

public class Demo01Main {
    public static void main(String[] args) {
        Demo01Thread mythread = new Demo01Thread();
        mythread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("当前线程"+Thread.currentThread().getName());

    }
}
