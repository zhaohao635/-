package jinjie.day02;

public class Student {
    private String name;
    public Student() {
        System.out.println("无参构造方法，构造方法已经不是默认赠送的了");
    }
    public Student(String name){
        this.name = name;
    }
    public void setName(String name1){
        this.name = name1;
    }
    public String getName(){
        return name;
    }
}
