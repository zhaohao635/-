package jinjie.day02;

public class Demo01Person {
    String name;
    private int age;
    private boolean ma;

    public void setMa(boolean maa) {
        ma = maa;
    }

    public boolean isMa() {
        return ma;
    }

    public void setAge(int num) {
        if (num <= 100 && num > 0) {
            age = num;
        } else {
            System.out.println("数据有误");
        }
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + ":" + age);
    }
}
