package day9_0902.test.TesStundent;

/**
 * Created by ���� on 2016/9/2.
 */
public class Student extends People {

    String school;
    int schoolNum;

    public Student() {

        super();
    }

    public void work() {
        System.out.println("ѧϰѧϰ");
    }

    public Student(String name, String sex, int age, String guo, String school, int schoolNum) {
        super(name, sex, age, guo);
        this.school = school;
        this.schoolNum = schoolNum;
        out();
    }

    public void out() {

        System.out.print("���� " + name +
                " �ҵ����� " + age +
                " �ҵ��Ա� " + sex +
                " �ҵĹ��� " + guo +
                " �ҵ�ѧУ  " + school +
                " �ҵ�ѧ�� " + schoolNum);
    }
}
