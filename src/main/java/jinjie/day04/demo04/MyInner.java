package jinjie.day04.demo04;

public class MyInner {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
