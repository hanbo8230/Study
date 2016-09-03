package day9_0903.work.Pet;

import java.util.Scanner;

/**
 * Created by 韩博 on 2016/9/3.
 * 思路:创建一个宠物父类,类中包括属性有   1类型 breed 2 健康值 health 3亲密度 conhesion 4 名字 name
 * 都会吃东西
 */
public class Cat extends Pet {
    Scanner in = new Scanner(System.in);

    public Cat(String name) {
        setType("猫");
        setName(name);
    }

    public void go() {
        xuanBreed();
        xuanHealth();
    }

    public void xuanBreed() {
        System.out.print("请选择你想猫的品种" +
                "\n1: 高冷的布偶猫" +
                "\n2: 犯二的加菲猫");
        int x = in.nextInt();
        xuanBreed();
        while (true) {
            switch (x) {
                case 1:
                    super.setBreed("高冷的布偶猫");
                    System.out.println("您选择了: 高冷的布偶猫");
                    break;
                case 2:
                    super.setBreed("犯二的加菲猫");
                    System.out.println("您选择了: 犯二的加菲猫");
                    break;
                default:
                    System.out.print("您没有正正确的选择,请重新选择");
                    xuanBreed();
            }
        }
    }

    public void xuanHealth() {
        System.out.print("请输入你想要的健康值(1-100),默认是60: ");
        int x = in.nextInt();
        if (x >= 1 && x <= 100) {
            super.setHealth(x);
        } else {
            System.out.print("您的输入不在有效范围内,系统默认选择60");
            super.setHealth(60);
        }
    }
}
