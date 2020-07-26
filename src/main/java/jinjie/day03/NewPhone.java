package jinjie.day03;

public class NewPhone extends Phone{
    public NewPhone(){
        super();
        System.out.println("子类调用");
    }
    @Override
    public void show() {
        super.show();
        System.out.println("显示头像");
    }
}
