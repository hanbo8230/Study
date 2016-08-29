package day2_0829.test.work;

/**
 * Created by 韩博 on 2016/8/29.
 * 要求:写一个给定的数组逆序排列的方法
 */

import java.util.Scanner;
public class PaiXu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入你想要排序数字的个数: ");
        int num = in.nextInt();
        int arr[] = new int[num];
        for (int x = 1; x <= num; x++) {
            System.out.print("请输入第" + x + "个数: ");
            int n = in.nextInt();
            arr[x - 1] = n;
        }
        maoPao(arr);
    }

    public static void maoPao(int arr[]) {
        System.out.print("您输入的元素排序前为: ");
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
        System.out.print("元素逆序排列后为: ");
        for (int n : arr) {
            System.out.print(n + "; ");
        }
    }
}
