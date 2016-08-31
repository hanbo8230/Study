package day8_0831.test;

import day01.Test;

/**
 * Created by 韩博 on 2016/8/31.
 */
public class Test_1 {

    //有参数的构造方法
    public Test_1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //属性
    String name;
    int age;

    //返回方法
    public String out() {
        return "我的名字是: " + name + "\n我的年龄是: " + age;
    }

    public static void main(String[] args) {
        Test_1 test_1 = new Test_1("老大", 1024);
        String a = test_1.out();
        System.out.print(a);
    }
}
