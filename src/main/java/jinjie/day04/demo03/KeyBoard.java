package jinjie.day04.demo03;

public class KeyBoard implements USB{

    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }
    public void qiao(){
        System.out.println("敲键盘");
    }
}
