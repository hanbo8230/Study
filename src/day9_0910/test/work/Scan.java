package day9_0910.test.work;

import java.util.Scanner;

/**
 * Created by ���� on 2016/9/10.
 * ����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ���
 */
public class Scan {


    public static void main(String[] args) {
        Scan.go();
    }

    public static void go() {
        Scanner in = new Scanner(System.in);
        int a = 0;    //��ĸ����
        int b = 0;    //���ָ���
        int c = 0;    //�ո����
        int d = 0;    //��������
        System.out.println("������һ���ҵ��ַ���");
        String num = in.nextLine();
        char[] arr = num.toCharArray();
        //��ʼ�����ж�ѭ��
        for (int x = 0; x < arr.length; x++) {
            if (Character.isLetter(arr[x])) {
                a++;        //��ĸ����
            } else if (Character.isDigit(arr[x])) {
                b++;        //���ָ���
            } else if (Character.isWhitespace(arr[x])) {
                c++;        //�ո����
            } else {
                d++;        //��������
            }
        }
        System.out.println("��ĸ����: " + a + "\n���ָ���: " + b + "\n�ո����: " + c + "\n��������: " + d);
    }
}
