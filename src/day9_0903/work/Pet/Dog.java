package day9_0903.work.Pet;

import java.util.Scanner;

/**
 * Created by ���� on 2016/9/3.
 */
public class Dog extends Pet {
    Scanner in = new Scanner(System.in);

//ѡ��Ʒ��
    public void selectBreed() {
        System.out.print("��ѡ�����빷��Ʒ��" +
                "\n1: ���������Ĳ���" +
                "\n2: ������ʿ��");
        int x = in.nextInt();


            switch (x) {
                case 1:
                    super.setBreed("���������Ĳ���");
                    System.out.println("��ѡ����: ���������Ĳ���");
                    break;
                case 2:
                    super.setBreed("������ʿ��");
                    System.out.println("��ѡ����: ������ʿ��");
                    break;
                default:
                    System.out.print("��û������ȷ��ѡ��,������ѡ��");
                    selectBreed();
            }

    }

}