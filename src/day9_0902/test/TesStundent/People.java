package day9_0902.test.TesStundent;

/**
 * Created by 韩博 on 2016/9/2.
 */
public class People {
    public String name;
    public String sex;
    public int age;
    public String guo;

    public People() {
        out();
    }

    public People(String name, String sex, int age, String guo) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.guo = guo;
    }

    public void eat() {
        System.out.println("吃吃吃");
    }

    public void sleep() {
        System.out.println("睡睡睡");
    }

    public void work() {
        System.out.println("上班上班");
    }

    public void out() {
        System.out.print("我是 " + name + "我的年龄 " + age + "我的性别 " + sex + "我的国籍 " + guo);
    }
}
