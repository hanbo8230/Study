package day9_0902.test.TesStundent;

/**
 * Created by ���� on 2016/9/2.
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
        System.out.println("�ԳԳ�");
    }

    public void sleep() {
        System.out.println("˯˯˯");
    }

    public void work() {
        System.out.println("�ϰ��ϰ�");
    }

    public void out() {
        System.out.print("���� " + name + "�ҵ����� " + age + "�ҵ��Ա� " + sex + "�ҵĹ��� " + guo);
    }
}
