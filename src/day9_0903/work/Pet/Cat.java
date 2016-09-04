package day9_0903.work.Pet;

import java.util.Scanner;

/**
 * Created by 韩博 on 2016/9/3.
 * 思路:创建一个宠物父类,类中包括属性有   1类型 breed 2 健康值 health 3亲密度 conhesion 4 名字 name
 * 都会吃东西
 */
public class Cat extends Pet {
    Scanner in = new Scanner(System.in);


//选择品种(重写)
    public void selectBreed() {
        System.out.print("请选择你想猫的品种" +
                "\n1: 高冷的布偶猫" +
                "\n2: 犯二的加菲猫");
        int x = in.nextInt();

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
                    selectBreed();
            }

    }

}
