package jinjie.day04.demo04;

public class Body {
    public class Heart{
        public void beat(){
            System.out.println("111111");
            name = "af";
            System.out.println(name);
        }
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodBody(){
        System.out.println("外部类的方法");
        System.out.println(name);
    }
}
