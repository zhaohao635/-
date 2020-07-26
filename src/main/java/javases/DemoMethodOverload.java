package javases;

public class DemoMethodOverload {
    public static void main(String[] args) {
        System.out.println(getSum(10,20));
        System.out.println(getSum(10,30,80));

    }
    public static int getSum(int a,int b){
        return a+b;
    }
    public static int getSum(int a,int d,int c){
        return a+d+c;
    }
}
