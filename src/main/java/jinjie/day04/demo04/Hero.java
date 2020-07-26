package jinjie.day04.demo04;

public class Hero {
    private String name;
    private Weapon weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Hero() {
    }

    public Hero(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }
    public void show(){
        System.out.println("谁"+name+"武器："+weapon.getCode());
    }
}
