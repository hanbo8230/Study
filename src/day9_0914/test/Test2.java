package day9_0914.test;

import day9_0910.test.work.Sys;

import java.util.*;

/**
 * Created by ���� on 2016/9/14.
 */
public class Test2 {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.go();

    }

    public void go() {
        try {
            sop("����������С������\n�����һ��: ");

            double a = in.nextDouble();
            sop("����ڶ���: ");
            double b = in.nextDouble();
            sop("������Ϊ: " + (a / b));
        } catch (InputMismatchException e1) {
            sop("��������ݴ���");
            go();
        } catch (ArithmeticException e2) {
            sop("����� b ��ֵ����Ϊ 0");

        } catch (Exception e) {
            sop("�д���");
        }

    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
