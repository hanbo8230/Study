package day9_0901.test.work;

import java.util.Scanner;


/**
 * Created by 韩博 on 2016/9/1.
 */
public class Pet {          //pet: 宠物


    private String name;      //姓名
//    private int health;     //健康值
//    private int cohesion;   //亲密度
//    private String breed;  //品种

    public void go() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println("欢迎来到宠物店");
        System.out.print("请输入你想要领养宠物的名字: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        this.name =name;
        System.out.println("请选择你想要领养宠物的类型" +
                "1: 狗狗" +
                "2: 猫猫");
        int x = in.nextInt();
        if (x == 1) {
            System.out.println("请选择想要的狗狗" +
                    "1: 聪明的拉布拉多" +
                    "2: 犯二的哈士奇");
            int a = in.nextInt();
            dog.breed(a);
            System.out.println("请选择想要的健康值(1-100之间,默认是60)");
            int b = in.nextInt();
            dog.health(b);
            dog.speak(this.name);
        } else if (x == 2) {
            System.out.println("请选择想要的猫猫" +
                    "1: 肥肥的波斯猫" +
                    "2: 犯二加菲猫");
            int c = in.nextInt();
            cat.breed(c);
            System.out.println("请选择想要的健康值(1-100之间,默认是60)");
            int d = in.nextInt();
            cat.health(d);
            cat.speak(this.name);
        } else {
            System.out.println("您的选择有误");
        }


    }


}
