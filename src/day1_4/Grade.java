package day1_4;

/**
 * Created by ���� on 2016/8/27.
 * Ҫ��:1 �洢����ѧ���ɼ��������ƽ���ɼ���
 * 2 ��ӡ��������60-70��ѧ���ķ�����
 * (ѧ���ɼ���ѧ�������Ӽ�������.)
 * ˼��:    1: ����һ����,������ϵͳ�������
 * 2: ����һ������Ϊ�û�����X ������
 * 3: �����������������ѧ���ĳɼ�֮��
 * 4: ������������͵�ƽ����
 * 5:��ӡ��������60-70�ķ���
 */

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        go();
    }

    public static void go() {
        Scanner in = new Scanner(System.in);    //����һ������,������ϵͳ����ķ���
        System.out.print("������Ҫ���������ѧ������: ");
        int x = in.nextInt();       //����һ������x ��Ϊ���鳤��
        int[] arr = new int[x];   //������һ������Ϊx������
        //�����鸳ֵ
        for (int a = 1; a < arr.length + 1; a++) {
            System.out.print("�������" + a + "��ѧ���ķ���:  ");
            int y = in.nextInt();   //����һ������y ��Ϊѧ���ķ���
            arr[a - 1] = y;
        }
        //��������ѧ�������ĺ�
        int sum = 0;
        for (int b = 0; b < arr.length; b++) {
            int sum1 = arr[b];
            sum += sum1;
        }
        System.out.println((arr.length) + "��ѧ���ĳɼ��ܺ���: " + sum + "��");

        //�����ѧ��������ƽ����
        double pingJun = sum / arr.length;
        System.out.println((arr.length) + "��ѧ���ĳɼ�ƽ������: " + pingJun + "��");

        //��ӡ��60-70֮�������
        System.out.print("60-70֮��ķ�����");
        boolean isExist = false;
        for (int c = 0; c < arr.length; c++) {
            if (arr[c] <= 70 && arr[c] >= 60) {
                System.out.print(arr[c] + "��, ");
                isExist = true;
            }
            if (!isExist) {
                System.out.print("�����ڵ�");
            }
        }
    }
}
