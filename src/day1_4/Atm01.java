package day1_4;

import java.util.*;

public class Atm01 {
    public static void main(String[] args) {
        //1.�Զ���һ���û�
        String username = "admin";
        String password = "888888";
        double balance = 1000.0;   //�˻����
        //2.��½����
        System.out.println("��ӭ����***����");
        Scanner input = new Scanner(System.in);

        //��������ѭ��,�����������
        for (int x = 1; x <= 3; x++) {
            System.out.print("�������û�����");
            String name = input.next();
            System.out.print("���������룺");
            String pwd = input.next();
            if (username.equals(name) && password.equals(pwd)) {
                System.out.println(name + "��½�ɹ�");
                System.out.print("������ȡ����");
                    double qu = input.nextDouble();

         //����ȡ���ʾ�˻����
                if(qu < balance) {
                    balance = balance - qu;
                    System.out.print("����ȡ��" + qu + "Ԫ\n���Ϊ: " + balance + "Ԫ");
                    break;
                } else {

         //���������,�����˳�
                    System.out.print("����˰�,��������ô��Ǯ,�Ҹ����˳�ϵͳ�˰�");
                    break;
                }
            } else {

         //���������û������û��������룬������Σ��Զ��˳�ϵͳ
                if (x != 3)
                    System.out.println("�û�����������󣬵�½ʧ�ܣ�����������...");
                else if (x == 3) {
                    System.out.println("�����������������,ϵͳ���Զ��˳�");
                    break;
                }
            }

        }
    }
}
