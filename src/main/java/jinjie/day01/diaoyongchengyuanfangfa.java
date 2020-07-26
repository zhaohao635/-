package jinjie.day01;

public class diaoyongchengyuanfangfa {
    public static void main(String[] args) {
        ceshichengyuanfangfa stu = new ceshichengyuanfangfa();
        stu.name = "赵";
        System.out.println(stu.name);       //这个结果为王
        stu.eat();
        System.out.println("==========");
        method(stu);
        System.out.println(stu.name);       //这个结果为王
    }
    public static void method(ceshichengyuanfangfa param){
        System.out.println(param.name);     //这个结果为赵
        param.name = "王";
        System.out.println(param.name);     //这个结果为王
    }
}
