package jinjie.day08.demo03;

public class Demo03Recurison {
    public static void main(String[] args) {
        System.out.println(m(10));

    }
    public static int m(int i){
        if (i==1){
            return 1;
        }


        return i*m(i-1);
    }
}
