package day1_4;

/**
 * Created by 韩博 on 2016/8/27.
 * 要求:1 存储所有学生成绩，并求出平均成绩。
 * 2 打印出分数在60-70的学生的分数。
 * (学生成绩和学生人数从键盘输入.)
 * 思想:    1: 导入一个包,并创建系统输入对象
 * 2: 建立一个长度为用户输入X 的数组
 * 3: 计算出这个数组的所有学生的成绩之和
 * 4: 计算出这个数组和的平均数
 * 5:打印出分数在60-70的分数
 */

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        go();
    }

    public static void go() {
        Scanner in = new Scanner(System.in);    //创建一个对象,并调用系统输入的方法
        System.out.print("请输入要存入分数的学生个数: ");
        int x = in.nextInt();       //定义一个变量x 作为数组长度
        int[] arr = new int[x];   //定义了一个长度为x的数组
        //对数组赋值
        for (int a = 1; a < arr.length + 1; a++) {
            System.out.print("请输入第" + a + "个学生的分数:  ");
            int y = in.nextInt();   //定义一个变量y 作为学生的分数
            arr[a - 1] = y;
        }
        //计算出这个学生分数的和
        int sum = 0;
        for (int b = 0; b < arr.length; b++) {
            int sum1 = arr[b];
            sum += sum1;
        }
        System.out.println((arr.length) + "名学生的成绩总和是: " + sum + "分");

        //计算出学生分数的平均数
        double pingJun = sum / arr.length;
        System.out.println((arr.length) + "名学生的成绩平均数是: " + pingJun + "分");

        //打印出60-70之间的数字
        System.out.print("60-70之间的分数是");
        boolean isExist = false;
        for (int c = 0; c < arr.length; c++) {
            if (arr[c] <= 70 && arr[c] >= 60) {
                System.out.print(arr[c] + "分, ");
                isExist = true;
            }
            if (!isExist) {
                System.out.print("不存在的");
            }
        }
    }
}
