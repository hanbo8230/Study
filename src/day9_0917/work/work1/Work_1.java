package day9_0917.work.work1;

import java.util.*;

/**
 * Created by ���� on 2016/9/17.
 * ��д����Ҫ���������������������ͬʱ����ǰ����������ĳ˻���
 * ���˻�����100000������Ϊ���쳣�����񲢴�������쳣�������Ϣ��
 */
public class Work_1 {

    public static void main(String[] args) {
        try {
            max();
        } catch (InputMismatchException e) {
            System.out.println("���벻������");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static void max() throws IllegalArgumentException, InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.print("������Ҫ�������ֵĸ�����");
        int t = 0;
        while (true) {
            try {
                t = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("�������������һ����������");
                input=new Scanner(System.in);
            }
        }
        int x = 1;
        for (int j = 0; j < t; j++) {
            System.out.print("������һ������");
            int i = input.nextInt();
            x = x * i;
            if (x <= 100000) {
                continue;
            } else {
                throw new IllegalArgumentException("�˻����ܴ���100000");
            }
        }
        System.out.println(x);
    }
}