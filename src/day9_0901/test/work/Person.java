package day9_0901.test.work;

import java.util.Scanner;

/**
 * Created by 韩博 on 2016/9/1.
 * 要求:某公司正进行招聘工作，被招聘人员需要填写个人信息，编写“个人简历”的封装类。
 * 包括如下属性进行设置和打印。
 * String name;// 姓名
 * String sex;// 性别
 * int age;// 年龄
 * String adress;// 家庭住址
 */
public class Person {
    private String name;
    private String sex;
    private int age;
    private String adress;

    Person() {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.adress = adress;
    }

    public void in() {
        Scanner in = new Scanner(System.in);
        System.out.println("个人简历");
        System.out.print("请输入姓名: ");
        String name = in.next();
        this.name = name;
        System.out.print("性别: ");
        String sex = in.next();
        this.sex = sex;
        System.out.print("请输入年龄: ");
        int age = in.nextInt();
        this.age = age;
        System.out.print("家庭住址: ");
        String adress = in.next();
        this.adress = adress;
        print();
    }

    private void print() {
        System.out.println(this.name + "的简历信息" +
                "\n姓名: " + this.name +
                "\n性别: " + this.sex +
                "\n年龄: " + this.age +
                "\n家庭住址: " + this.adress);

    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
