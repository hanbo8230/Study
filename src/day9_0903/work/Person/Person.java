package day9_0903.work.Person;

import java.lang.ref.SoftReference;

/**
 * Created by ���� on 2016/9/4.
 * ����һ�����࣬�������ԣ�����name���Ա�sex������gae������ nationality��
 * �����������Է�eat��˯��sleep������work��
 * ��1��һ��������̳������࣬�������������ԣ���λ�����䣻��д�������������˵Ĺ����ǡ����Լ���ɣ���
 * ��2��һ�����˸ɲ���̳��Թ����࣬�������������ԣ�ְ�����ӷ��������ᡣ
 * ��3����д�������ֱ������3�����������в��ԡ�
 */
public class Person {
    private String name;
    private String sex;
    private int age;
    private String nationality;

    public void work(){
        System.out.println("�һṤ��~~��������");
    }

    public void sleep(){
        System.out.println("�һ�˯��~~˯˯˯˯");
    }
    public void eat(){
        System.out.println("�һ�Է�~~�ԳԳԳ�");
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
