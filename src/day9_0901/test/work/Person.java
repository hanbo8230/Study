package day9_0901.test.work;

import java.util.Scanner;

/**
 * Created by ���� on 2016/9/1.
 * Ҫ��:ĳ��˾��������Ƹ����������Ƹ��Ա��Ҫ��д������Ϣ����д�����˼������ķ�װ�ࡣ
 * �����������Խ������úʹ�ӡ��
 * String name;// ����
 * String sex;// �Ա�
 * int age;// ����
 * String adress;// ��ͥסַ
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
        System.out.println("���˼���");
        System.out.print("����������: ");
        String name = in.next();
        this.name = name;
        System.out.print("�Ա�: ");
        String sex = in.next();
        this.sex = sex;
        System.out.print("����������: ");
        int age = in.nextInt();
        this.age = age;
        System.out.print("��ͥסַ: ");
        String adress = in.next();
        this.adress = adress;
        print();
    }

    private void print() {
        System.out.println(this.name + "�ļ�����Ϣ" +
                "\n����: " + this.name +
                "\n�Ա�: " + this.sex +
                "\n����: " + this.age +
                "\n��ͥסַ: " + this.adress);

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
