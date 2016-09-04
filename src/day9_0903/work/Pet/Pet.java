package day9_0903.work.Pet;

import java.util.Scanner;

/**
 * Created by 韩博 on 2016/9/3.
 * 思路:创建一个宠物父类,类中包括属性有   1类型 breed 2 健康值 health 3亲密度 conhesion 4 名字 name
 * 都会吃东西
 */
public class Pet {
    private String name;
    private String breed;
    private String tep;
    private int health;
    private int conhesion = 99;
    Scanner in = new Scanner(System.in);


    Pet() {
    }


////选择品种
    public void selectBreed(){

    }
    //选健康值
    public void selecHealth() {
        System.out.println("请输入你想要的健康值(1-100),默认是60: ");
        int x = in.nextInt();
        if (x >= 1 && x <= 100) {
            setHealth(x);
        } else {
            System.out.println("您的输入不在有效范围内,系统默认选择60");
            setHealth(60);
        }
    }

    //自白
    public void speak() {
        System.out.println("我的名字叫: " + name +
                ",我的健康值是 " + health +
                ",我和主人亲密度是: " + conhesion +
                ",我的类型是: " + breed);
    }

    public int getConhesion() {
        return conhesion;
    }

    public void setConhesion(int conhesion) {
        this.conhesion = conhesion;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getBreed() {

        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTep() {
        return tep;
    }

    public void setTep(String tep) {
        this.tep = tep;
    }


}
