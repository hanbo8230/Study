package day8_0830.test.work;

import java.util.Scanner;

/**
 * Created by ���� on 2016/8/30.
 * Ҫ��:����Manage�࣬�����·���
 * �����û�������������洢����ѧ���ĳɼ�
 * Ȼ����������Բ�������ʽ��ֵ��ĳһ������
 * ���������Ҫ���û�����ѧ���ĳɼ��ȼ� ��
 * A �򷵻�90~100���ڵ�����ѧ���ɼ�
 * B �򷵻� 80~90 ���ڵ�����ѧ���ɼ�
 * C �򷵻� 70~80���ڵ�����ѧ���ɼ�
 * D �򷵻� 70 ���µ�ѧ���ɼ�
 * ���û������������ѧ���ɼ��򷵻أ��� û������������ѧ����
 */
public class Manage {
    Scanner in = new Scanner(System.in);

    //�û�����ѧ������,�ͷ���
    public int[] get_arr() {
        System.out.print("������ѧ���ĸ���: ");
        int num = in.nextInt();
        int arr[] = new int[num];
        for (int x = 1; x <= num; x++) {
            System.out.print("�������" + x + "ѧ���ķ���: ");
            int n = in.nextInt();
            arr[x - 1] = n;
        }
        return arr;
    }

    private void xuanZhe(int arr[], int a, int b) {
        System.out.print(a + "`" + b + "���ڵ�����ѧ���ɼ�Ϊ: ");
        int num = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] >= a && arr[x] <= b) {
                System.out.print(arr[x] + "\t");
                num++;
            }
            if (num == 0) {
                System.out.print("û�иõȼ���ѧ��");
            }
        }
    }

    public void get_Math(int arr[]) {
        System.out.print("������Ҫ��ѯѧ���ĳɼ��ȼ�(1-4): \n" +
                "1Ϊ90~100���ڵ�����ѧ���ɼ�\n" +
                "2Ϊ80~90 ���ڵ�����ѧ���ɼ�\n" +
                "3Ϊ70~80���ڵ�����ѧ���ɼ�\n" +
                "4Ϊ70���µ�ѧ���ɼ�");
        int x = in.nextInt();
        switch (x) {
            case 1:
                xuanZhe(arr, 90, 100);
                break;
            case 2:
                xuanZhe(arr, 80, 90);
                break;
            case 3:
                xuanZhe(arr, 70, 80);
                break;
            case 4:
                xuanZhe(arr, 0, 70);
                break;
            default:
                System.out.print("���������������");
                break;
        }
    }
}
