package day9_0917.work.work3;

import java.util.*;

/**
 * Created by ���� on 2016/9/17.
 * ����Լ����쳣���ʾ�Ը�����ƽ�����Ĵ�������Test���������У�
 * �Ӽ�������һ�����������������С��0�����������ƽ��������С��0��
 * ���׳��Զ����쳣���ڳ����д����쳣�������ʾ��Ϣ��������󣬲��ܶԸ�����ƽ������
 */

public class Test {

    public static void main(String[] args) {
        try {
            System.out.println(fun());
        } catch (MyException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public static double fun() throws MyException, InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.print("������һ���Ǹ�����");
        int s = input.nextInt();
        if (s >= 0) {
            return Math.sqrt(s);
        } else {
            throw new MyException("��������");
        }
    }
}
