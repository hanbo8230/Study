package day9_0903.work.Pet;

import java.util.Scanner;

/**
 * Created by ���� on 2016/9/3.
 * ˼·:����һ�����︸��,���а���������   1���� breed 2 ����ֵ health 3���ܶ� conhesion 4 ���� name
 * ����Զ���
 */
public class Pet {
    private String name;
    private String breed;
    private String tep;
    private int health;
    private int conhesion = 99;
    Scanner in = new Scanner(System.in);


    Pet() {
    }


////ѡ��Ʒ��
    public void selectBreed(){

    }
    //ѡ����ֵ
    public void selecHealth() {
        System.out.println("����������Ҫ�Ľ���ֵ(1-100),Ĭ����60: ");
        int x = in.nextInt();
        if (x >= 1 && x <= 100) {
            setHealth(x);
        } else {
            System.out.println("�������벻����Ч��Χ��,ϵͳĬ��ѡ��60");
            setHealth(60);
        }
    }

    //�԰�
    public void speak() {
        System.out.println("�ҵ����ֽ�: " + name +
                ",�ҵĽ���ֵ�� " + health +
                ",�Һ��������ܶ���: " + conhesion +
                ",�ҵ�������: " + breed);
    }

    public int getConhesion() {
        return conhesion;
    }

    public void setConhesion(int conhesion) {
        this.conhesion = conhesion;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getBreed() {

        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTep() {
        return tep;
    }

    public void setTep(String tep) {
        this.tep = tep;
    }


}
