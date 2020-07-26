package jinjie.day07.demo01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//public class RunnableIml implements Runnable{
//    Lock l = new ReentrantLock();
//    int tickets = 100;
//    @Override
//    public void run() {
//        while (true){
//            l.lock();
//            if (tickets>0){
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets+"票");
//                tickets--;
//
//            }
//            l.unlock();
//        }
//    }
//}
public class RunnableIml implements Runnable {
    Lock l = new ReentrantLock();
    int tickets = 100;

    @Override
    public void run() {
        while (true) {
            l.lock();
            if (tickets > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "票");
                    tickets--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    l.unlock();
                }
            }
        }
    }
}
