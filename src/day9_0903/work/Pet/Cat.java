package day9_0903.work.Pet;

import java.util.Scanner;

/**
 * Created by ���� on 2016/9/3.
 * ˼·:����һ�����︸��,���а���������   1���� breed 2 ����ֵ health 3���ܶ� conhesion 4 ���� name
 * ����Զ���
 */
public class Cat extends Pet {
    Scanner in = new Scanner(System.in);


//ѡ��Ʒ��(��д)
    public void selectBreed() {
        System.out.print("��ѡ������è��Ʒ��" +
                "\n1: ����Ĳ�żè" +
                "\n2: �����ļӷ�è");
        int x = in.nextInt();

            switch (x) {
                case 1:
                    super.setBreed("����Ĳ�żè");
                    System.out.println("��ѡ����: ����Ĳ�żè");
                    break;
                case 2:
                    super.setBreed("�����ļӷ�è");
                    System.out.println("��ѡ����: �����ļӷ�è");
                    break;
                default:
                    System.out.print("��û������ȷ��ѡ��,������ѡ��");
                    selectBreed();
            }

    }

}
