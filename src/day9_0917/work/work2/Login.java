package day9_0917.work.work2;

import java.util.*;

/**
 * Created by ���� on 2016/9/17.
 * ��дһ����¼���棬Ҫ���ʻ���ֻ����1��10λ������ɣ�
 * ����ֻ����6λ���κβ������ʻ���������Ҫ����������Ϊ�쳣��
 * ���벶�񲢴����쳣
 */

public class Login {

    public static void main(String[] args) {
        while (true) {
            try {
                fun();
                break;
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        System.out.println("login....");
    }

    public static int inputInt() {
        Scanner input = new Scanner(System.in);
        try {
            int s = input.nextInt();
            return s;
        } catch (InputMismatchException e) {
            System.out.println("��������");
            System.exit(0);
            return 0;
        }
    }

    static void fun() throws IllegalArgumentException {
        System.out.print("�����û�����");
        int name = inputInt();
        if (name < 1 || name > 999999999) {
            throw new IllegalArgumentException("�û��������㷶Χ�޶�");
        }
        System.out.print("���������룺");
        int password = inputInt();
        if (password < 100000 || password > 999999) {
            throw new IllegalArgumentException("���벻���㷶Χ�޶�");
        }

    }
}
