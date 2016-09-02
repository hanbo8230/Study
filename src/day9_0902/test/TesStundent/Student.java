package day9_0902.test.TesStundent;

/**
 * Created by 韩博 on 2016/9/2.
 */
public class Student extends People {

    String school;
    int schoolNum;

    public Student() {

        super();
    }

    public void work() {
        System.out.println("学习学习");
    }

    public Student(String name, String sex, int age, String guo, String school, int schoolNum) {
        super(name, sex, age, guo);
        this.school = school;
        this.schoolNum = schoolNum;
        out();
    }

    public void out() {

        System.out.print("我是 " + name +
                " 我的年龄 " + age +
                " 我的性别 " + sex +
                " 我的国籍 " + guo +
                " 我的学校  " + school +
                " 我的学号 " + schoolNum);
    }
}
