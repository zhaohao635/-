package jinjie.day07.demo01;

public class Demo01Ticket {
    public static void main(String[] args) {
        RunnableIml runnableIml = new RunnableIml();
        Thread thread1 = new Thread(runnableIml);
        Thread thread2 = new Thread(runnableIml);
        Thread thread3 = new Thread(runnableIml);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
