package jinjie.day08.demo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableIml());   //pool-1-thread-1正在执行
        es.submit(new RunnableIml());   //pool-2-thread-1正在执行
        es.submit(new RunnableIml());   //pool-1-thread-1正在执行
    }
}
