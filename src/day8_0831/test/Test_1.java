package day8_0831.test;

import day01.Test;

/**
 * Created by ���� on 2016/8/31.
 */
public class Test_1 {

    //�в����Ĺ��췽��
    public Test_1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //����
    String name;
    int age;

    //���ط���
    public String out() {
        return "�ҵ�������: " + name + "\n�ҵ�������: " + age;
    }

    public static void main(String[] args) {
        Test_1 test_1 = new Test_1("�ϴ�", 1024);
        String a = test_1.out();
        System.out.print(a);
    }
}
