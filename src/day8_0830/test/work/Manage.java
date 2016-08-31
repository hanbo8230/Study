package day8_0830.test.work;

import java.util.Scanner;

/**
 * Created by 韩博 on 2016/8/30.
 * 要求:创建Manage类，有以下方法
 * 接受用户输入来用数组存储几个学生的成绩
 * 然后将这个数组以参数的形式传值给某一个方法
 * 这个方法中要求用户输入学生的成绩等级 ：
 * A 则返回90~100以内的所有学生成绩
 * B 则返回 80~90 以内的所有学生成绩
 * C 则返回 70~80以内的所有学生成绩
 * D 则返回 70 以下的学生成绩
 * 如果没有满足条件的学生成绩则返回：“ 没有满足条件的学生”
 */
public class Manage {
    Scanner in = new Scanner(System.in);

    //用户输入学生个数,和分数
    public int[] get_arr() {
        System.out.print("请输入学生的个数: ");
        int num = in.nextInt();
        int arr[] = new int[num];
        for (int x = 1; x <= num; x++) {
            System.out.print("请输入第" + x + "学生的分数: ");
            int n = in.nextInt();
            arr[x - 1] = n;
        }
        return arr;
    }

    private void xuanZhe(int arr[], int a, int b) {
        System.out.print(a + "`" + b + "以内的所有学生成绩为: ");
        int num = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] >= a && arr[x] <= b) {
                System.out.print(arr[x] + "\t");
                num++;
            }
            if (num == 0) {
                System.out.print("没有该等级的学生");
            }
        }
    }

    public void get_Math(int arr[]) {
        System.out.print("请输入要查询学生的成绩等级(1-4): \n" +
                "1为90~100以内的所有学生成绩\n" +
                "2为80~90 以内的所有学生成绩\n" +
                "3为70~80以内的所有学生成绩\n" +
                "4为70以下的学生成绩");
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
                System.out.print("您输入的数据有误");
                break;
        }
    }
}
