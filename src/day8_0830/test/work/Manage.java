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

    public void get_Math(int arr[]) {
        System.out.print("������Ҫ��ѯѧ���ĳɼ��ȼ�(1-4): \n" +
                "1Ϊ90~100���ڵ�����ѧ���ɼ�\n" +
                "2Ϊ80~90 ���ڵ�����ѧ���ɼ�\n" +
                "3Ϊ70~80���ڵ�����ѧ���ɼ�\n" +
                "4Ϊ70���µ�ѧ���ɼ�");
        int x = in.nextInt();
        switch (x) {
            case 1:
                System.out.print("90~100���ڵ�����ѧ���ɼ�Ϊ: ");
                for (int a = 0; a < arr.length; a++) {
                    if (arr[a] >= 90 && arr[a] <= 100) {
                        System.out.print(arr[a]+"\t");
                    }
                }
                break;
            case 2:
                System.out.print("80~90���ڵ�����ѧ���ɼ�Ϊ: ");
                for (int a = 0; a < arr.length; a++) {
                    if (arr[a] >= 80 && arr[a] <= 90) {
                        System.out.print(arr[a]+"\t");
                    }
                }
                break;
            case 3:
                System.out.print("70~80���ڵ�����ѧ���ɼ�Ϊ: ");
                for (int a = 0; a < arr.length; a++) {
                    if (arr[a] >= 70 && arr[a] <= 80) {
                        System.out.print(arr[a]+"\t");
                    }
                }
                break;
            case 4:
                System.out.print("70���µ�����ѧ���ɼ�Ϊ: ");
                for (int a = 0; a < arr.length; a++) {
                    if (arr[a] <70 ) {
                        System.out.print(arr[a]+"\t");
                    }
                }
                break;
            default:
                System.out.print("���������������");
                break;
        }
    }
}
