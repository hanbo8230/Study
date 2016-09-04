package day9_0903.work.Person;

import java.lang.ref.SoftReference;

/**
 * Created by 韩博 on 2016/9/4.
 * 定义一个人类，包括属性：姓名name、性别sex、年龄gae、国籍 nationality；
 * 包括方法：吃饭eat、睡觉sleep，工作work。
 * （1）一个工人类继承自人类，派生，增加属性：单位、工龄；重写工作方法（工人的工作是……自己想吧）。
 * （2）一个工人干部类继承自工人类，派生，增加属性：职务；增加方法：开会。
 * （3）编写主函数分别对上述3类具体人物进行测试。
 */
public class Person {
    private String name;
    private String sex;
    private int age;
    private String nationality;

    public void work(){
        System.out.println("我会工作~~作作作作");
    }

    public void sleep(){
        System.out.println("我会睡觉~~睡睡睡睡");
    }
    public void eat(){
        System.out.println("我会吃饭~~吃吃吃吃");
    }




    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
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
