package jinjie.day04.demo02;

public class User {
    private String name;
    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public User() {
    }
    public void show(){
        System.out.println("用户名"+name+"余额为："+money);
    }
}
