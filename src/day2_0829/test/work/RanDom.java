package day2_0829.test.work;

/**
 * Created by ���� on 2016/8/29.
 * Ҫ��:дһ�������ֵ���Ϸ��������ΪguessNumber()��
 * ����¶��ˣ���ϲ�¶��ˡ�����Ҫ�����²£�ֱ���¶�Ϊֹ��
 */

import java.util.Scanner;
import java.util.Random;

public class RanDom {
    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        Random r = new Random();
        int num = r.nextInt(10) + 1;
        Scanner in = new Scanner(System.in);
        System.out.print("������һ������");
        int n = in.nextInt();
        while (n != num) {
            System.out.print("�Բ���,��û�в���,����������һ������: ");
            n = in.nextInt();
        }
        System.out.print("��ϲ���¶���,�н�����Ϊ: " + num +"���µ�����Ϊ: "+ n);
    }


}
