package day2_0829.test.work;

/**
 * Created by ���� on 2016/8/29.
 * Ҫ��:дһ�������������������еķ���
 */

import java.util.Scanner;
public class PaiXu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("����������Ҫ�������ֵĸ���: ");
        int num = in.nextInt();
        int arr[] = new int[num];
        for (int x = 1; x <= num; x++) {
            System.out.print("�������" + x + "����: ");
            int n = in.nextInt();
            arr[x - 1] = n;
        }
        maoPao(arr);
    }

    public static void maoPao(int arr[]) {
        System.out.print("�������Ԫ������ǰΪ: ");
        for (int m : arr) {
            System.out.print(m + "; ");
        }
        System.out.println();
        for (int x = 0; x < arr.length; x++) {
            for (int y = 1; y < arr.length - x; y++) {
                int c = 0;
                if (arr[y - 1] < arr[y]) {
                    c = arr[y];
                    arr[y] = arr[y - 1];
                    arr[y - 1] = c;
                }
            }
        }
        System.out.print("Ԫ���������к�Ϊ: ");
        for (int n : arr) {
            System.out.print(n + "; ");
        }
    }
}
