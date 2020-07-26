package jinjie.day07.demo04;

public class MainThread {
    public static void main(String[] args) {
        ThreadIml threadIml = new ThreadIml();
        Thread thread = new Thread(threadIml);
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
