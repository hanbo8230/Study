package day8_0830.test.work;

import java.util.Scanner;

/**
 * Created by ���� on 2016/8/30.
 * ����:(1).�����д����������name,String���ͣ������balance,double���ͣ���
 * ���ڣ�year,int���ͣ������ʣ�rate,double���ͣ��ĸ����ԣ��������ʵ�Ĭ��ֵΪ0.01��
 * ����Ĭ�ϵĴ���Ϊ10Ԫ������Ϊһ�ꡣ
 * (2).������������������save����ȡ�fetch�����������������ܽ�calcTotal����
 */
public class BankAccount {
    Scanner in = new Scanner(System.in);

    String name;    //���������
    double balance = 10;    //����
    int year = 1;   //����
    double rate = 0.01;  //����


    //����
    public void save() {
        System.out.print("������Ҫ���Ǯ����: ");
        double x = in.nextDouble();
        balance += x;
        System.out.println("������: " + x + "Ԫ\n�������Ϊ: " + balance);
    }

    //ȡ���
    public void fetch() {
        System.out.print("������Ҫȡ��Ǯ����: ");
        double y = in.nextDouble();
        if (y > balance) {
            System.out.println("û��ô��Ǯ");
        } else {
            balance -= y;
            System.out.println("��ȡ��: " + y + "Ԫ\n�������Ϊ: " + balance);
        }
    }

    //�������������ܽ��
    public void calcTotal() {
        double n = balance + balance * rate * year;
        System.out.println("������" + year + "�����ܽ��Ϊ: " + n);
    }

}
