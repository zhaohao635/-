package jinjie.day04.demo04;

public class YingXiong {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");
        Weapon weapon = new Weapon("多兰剑");

        hero.setWeapon(weapon);
        hero.show();
    }
}
