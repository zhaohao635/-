package jinjie.day10.demo02;

public class Demo01Lambda {
    public static void showLog(int level,MessageBuilder mb){
        if (level == 1){
            System.out.println(mb.showLevel());
        }else if(level==2){
            System.out.println("---------");
        }
    }
    public static void main(String[] args) {
        String mess1 = "hello";
        String mess2 = "world";
        showLog(2,()->{
            System.out.println("=====");
            return mess1+mess2;
        });
    }
}
