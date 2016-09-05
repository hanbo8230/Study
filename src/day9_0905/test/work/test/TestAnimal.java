package day9_0905.test.work.test;

import day9_0901.test.work.*;
import day9_0905.test.work.run.*;
import day9_0905.test.work.run.Dog;


/**
 * Created by 韩博 on 2016/9/5.
 * 请编码实现动物世界的继承关系：
 * 动物（Animal）具有行为：吃（eat）、睡觉（sleep）
 * 动物包括：兔子（Rabbit），老虎（Tiger），狗（Dog）
 * 这些动物吃的行为各不相同（兔子吃草，老虎吃肉, 狗吃狗粮）；但睡觉的行为是一致的。
 * 1）请通过继承实现以上需求，并编写测试类AnimalTest进行测试。
 * 2）利用向上转型对象调用重写的方法
 */
public class TestAnimal {
    public static void main(String[] args) {
        //向上转型
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
        Animal rabbit = new Rabbit();
        rabbit.eat();
        rabbit.sleep();
        Animal tiger = new Tiger();
        tiger.eat();
        tiger.sleep();

        Dog d =(Dog) dog;
        d.kanJia();

        int y=1;
        double x = 1;
        System.out.print((int)(x+y));

    }

}
