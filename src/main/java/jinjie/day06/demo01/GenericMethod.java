package jinjie.day06.demo01;

public class GenericMethod {
    public <M> void method01(M m){
        System.out.println(m);
    }
    public static <W> void method02(W w){
        System.out.println(w);
    }
}
